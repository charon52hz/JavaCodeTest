package org.chz.mt;

import java.util.Scanner;

public class BalanceMatrix {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {   //i = 边长
            if ((i * i) % 2 == 1){
                System.out.println(0);
                continue;
            }

            int count = 0;
            for (int j = 0; j < n - i + 1; j++) {
                for (int k = 0; k < n - i + 1; k++) {
                    int sum = 0;
                    for (int l = 0; l < i; l++) {
                        for (int m = 0; m < i; m++) {
                            sum += matrix[j+l][k+m];
                        }
                    }
                    if (sum * 2 == i * i){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }*/
    static final int N = 200;
    static int[][] matrix = new int[N][N];
    static int[][] matrix_sum = new int[N][N];

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<=n ; i++){
            String s = input.next();
            for(int k=1; k<=n; k++){
                matrix[i][k] = s.charAt(k-1)=='1'? 1:0;
            }
        }

        for(int i=1; i<=n ;i++){
            for(int j=1; j<=n ;j++){
                matrix_sum[i][j] = matrix_sum[i-1][j] + matrix_sum[i][j-1] - matrix_sum[i-1][j-1] + matrix[i][j];
            }
        }

        for(int i=1 ;i<=n ;i++){
            int count = 0;
            for(int x=1; x<=n-i+1; x++){
                for(int y=1; y<=n-i+1; y++){
                    int sum = matrix_sum[x+i-1][y+i-1] - matrix_sum[x+i-1][y-1] -
                            matrix_sum[x-1][y+i-1] + matrix_sum[x-1][y-1];
                    if(sum*2 == i*i){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
