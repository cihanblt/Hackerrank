package com.cb.Implementation;

import java.util.Scanner;

/**
 * Created by c.bulut on 2/17/2016.
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] n = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            n[a0] = in.nextInt();
        }

        for (int num : n) {
            findDigits(num);
        }
    }

    private static void findDigits(int num) {
        String s = String.valueOf(num);
        char[] chars = new char[s.length()];
        s.getChars(0,s.length(),chars,0);
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if(((double)num) % Double.parseDouble(String.valueOf(chars[i])) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
