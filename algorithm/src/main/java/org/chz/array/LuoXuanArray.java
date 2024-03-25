package org.chz.array;

import java.util.*;

public class LuoXuanArray {
    public static void main(String[] args) {
        int res[] = {1,2,3,4};
        System.out.println(Arrays.toString(Arrays.copyOfRange(res, 1, 4)));
    }
}

class Solution {
    public int[][] generateMatrix(int n) {
        int res [][] = new int[n][n];    // 存放结果
        int num = 1;    // 起始数字

        int top = 0;    // 当前矩阵的顶
        int down = n-1; // 当前矩阵的底
        int left = 0;   // 当前矩阵的左边界
        int right = n-1;    // 当前矩阵的右边界
        while(true) {
            // 左 -> 右
            for(int i = left; i <= right; i++){
                res[top][i] = num++;
            }
            // 从左到右，遍历完顶部的一行，顶向下移动，如果超过底部，停止循环
            if(++top > down) break;

            // 上 -> 下
            for(int i = top; i <= down; i++){
                res[i][right] = num++;
            }
            // 从上到下，遍历完右边界的一列，右边界向左移动
            if(--right < left) break;

            // 右 -> 左
            for(int i = right; i >= left; i--){
                res[down][i] = num++;
            }
            // 从右到左，遍历完底部的一行，底向上移动
            if(--down < top) break;

            // 底 -> 顶
            for(int i = down; i >= top; i--){
                res[i][left] = num++;
            }
            // 从底向上，遍历完左边界的一列，左边界向右移动
            if(++left > right) break;
        }
        return res;
    }
}