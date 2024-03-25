package org.chz.array;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int target = in.nextInt();

        int left = 0;
        int right = n-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                System.out.println(mid);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
