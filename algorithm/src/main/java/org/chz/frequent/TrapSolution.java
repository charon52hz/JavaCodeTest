package org.chz.frequent;

import java.util.Stack;

public class TrapSolution {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

/*    //暴力算法，超时
    public static int trap(int[] height) {
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (i == 0 || i == len-1){
                continue;
            }
            int leftH = height[i];
            int rightH = height[i];
            for (int j = i-1; j >= 0; j--) {
                if (height[j] > leftH){
                    leftH = height[j];
                }
            }
            for (int j = i+1; j < len; j++) {
                if (height[j] > rightH){
                    rightH = height[j];
                }
            }
            sum += Math.min(leftH,rightH)-height[i];
        }
        return sum;
    }*/

/*    //双指针法
    public static int trap(int[] height){
        int sum = 0;
        int len = height.length;
        if (len <= 2) return sum;
        int leftH[] = new int[len];
        int rightH[] = new int[len];

        leftH[0] = height[0];
        for (int i = 1; i < len; i++) {
            leftH[i] = Math.max(leftH[i-1], height[i]);
        }

        rightH[len-1] = height[len-1];
        for (int i = len-2; i >= 0; i--) {
            rightH[i] = Math.max(rightH[i+1], height[i]);
        }

        for (int i = 0; i < len; i++) {
            int count = Math.min(leftH[i],rightH[i]) - height[i];
            if (count > 0){
                sum += count;
            }

        }
        return sum;
    }*/

    public static int trap(int[] height){
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        return sum;
    }

}
