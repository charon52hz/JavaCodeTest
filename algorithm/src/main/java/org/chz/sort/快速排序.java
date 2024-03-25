package org.chz.sort;

import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] args) {
        int arr[] = new int[] {6,5,4,8,1,2,0,6,7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int low ,int high) {
        if (low < high) {
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot - 1);
            quickSort(arr,pivot + 1,high);
        }
    }

    public static int partition(int arr[], int low ,int high) {
        int value = arr[low];   //基准
        while (low < high) {
            while (low < high && arr[high] >= value) {
                high--;
            }
            arr[low] = arr[high];

            while (low < high && arr[low] <= value) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = value;
        return low;
    }
}
