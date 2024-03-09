package org.chz.mt;

import java.util.Scanner;

public class RangeDel {
    private static int getFactor2(int x){
        int f2 = 0;
        while (x != 0 && x % 2 == 0){
            f2++;
            x = x / 2;
        }
        return f2;
    }

    private static int getFactor5(int x){
        int f5 = 0;
        while (x != 0 && x % 5 == 0){
            f5++;
            x = x / 5;
        }
        return f5;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a[] = new int[n];

        int a2[] = new int[n];
        int a5[] = new int[n];

        int num2 = 0;
        int num5 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            a2[i] = getFactor2(a[i]);
            num2 += a2[i];
            a5[i] = getFactor5(a[i]);
            num5 += a5[i];
        }

        int left = 0;
        int count = 0;
        for (int right = 0; right < n; right++) {
            num2 = num2 - a2[right];
            num5 = num5 - a5[right];

            while (left <= right && Math.min(num2, num5) < k){
                num2 = num2 + a2[left];
                num5 = num5 + a5[left];
                left++;
            }
            count = count + right - left + 1;
        }
        System.out.println(count);
    }

}
