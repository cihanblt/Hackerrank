package com.cb.Implementation;

import java.util.Scanner;

/**
 * Created by cihan on 14.02.2016.
 */
public class SherlockAndBeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n[] = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            n[a0] = in.nextInt();
        }
        if (1 <= t && t <= 20) {
            for (int num : n) {
                if (1 <= num && num <= 100000) {
                    helpToSherlock(num);
                }
            }

        }

    }

    public static void helpToSherlock(int num) {
        StringBuilder s = new StringBuilder();
        int i = 0;
        int a = 0;
        for (i = num; i > 0 ; i--) {
            if ((i % 3 == 0) && ((num - i) % 5 == 0)) {
                for (a = 0; a < i; a++)
                    s.append("5");
                for(int j = a ; j < num ; j++)
                    s.append("3");
                break;
            }

            }

        if ( s.length() == 0 && (num % 5) == 0){
            for(int t = 0 ; t < num ; t++)
                s.append("3");

        }

        if(s.length() == 0){
            s.append("-1");
        }



        System.out.println(s.toString());

    }
}