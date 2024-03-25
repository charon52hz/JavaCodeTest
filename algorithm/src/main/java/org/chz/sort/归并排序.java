package org.chz.sort;

import java.util.Arrays;

public class 归并排序 {
    public static void main(String[] args) {
        int arr[] = new int[] {6,5,4,8,1,2,0,6,7};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];
        internalMergeSort(arr,temp,0,n - 1);
    }

    public static void internalMergeSort(int arr[], int temp[], int left ,int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            internalMergeSort(arr,temp,left,mid);
            internalMergeSort(arr,temp,mid+1,right);
            mergeArray(arr,temp,left,mid,right);
        }
    }

    public static void mergeArray(int arr[], int temp[] ,int left, int mid ,int right){
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int l = 0; l < k; l++) {
            arr[left + l] = temp[l];
        }
    }
}
