package org.chz.mt;

import java.util.Scanner;

public class mt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int change = in.nextInt();
        String s = in.next();

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'M' || s.charAt(i) == 'T'){
                count++;
            }
        }
        if (change + count > length){
            count = length;
        }else {
            count = change + count;
        }
        System.out.println(count);
    }
}
