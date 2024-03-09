package org.chz.mt;

import java.util.Scanner;

public class ArrayQuest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int q_l[][] = new int[q][2];
        for (int j = 0; j < q; j++) {
            q_l[j][0] = scanner.nextInt();
            q_l[j][1] = scanner.nextInt();
        }

        int res[][] = new int[q][2];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0){
                sum += a[i];
            }
            if (a[i] == 0){
                count++;
            }
        }
        for (int i = 0; i < q; i++) {
            res[i][0] = sum + q_l[i][0] * count;
            res[i][1] = sum + q_l[i][1] * count;
            System.out.println(res[i][0]+" "+res[i][1]);
        }
    }
}
