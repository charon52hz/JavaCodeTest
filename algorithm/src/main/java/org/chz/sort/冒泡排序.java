package org.chz.sort;

import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
        int arr[] = new int[] {6,5,4,8,1,2,0,6,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }
}
