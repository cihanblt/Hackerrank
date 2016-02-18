package com.cb.Implementation;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by c.bulut on 2/17/2016.
 */
public class SherlockAndSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[][]  ab = new int[t][2];
        for(int a0 = 0 ; a0 < t; a0++){
            ab[a0][0] = scanner.nextInt();
            ab[a0][1] = scanner.nextInt();
        }

        if(1<= t && t <= 100){
            for(int i = 0 ; i < t; i++){
                if((1 <= ab[i][0] && ab[i][0] <= Math.pow(10,9)) && (1 <= ab[i][1] && ab[i][1] <= Math.pow(10,9)) && (ab[i][0] <= ab[i][1])){
                    detectSquares(ab[i]);
                }
            }
        }
    }
    private static void detectSquares(int[] ab){
        double a = Math.sqrt(ab[0]);
        double b = Math.sqrt(ab[1]);
        double tempValue = Math.floor(b) - Math.ceil(a) + 1;
        int result = (int)tempValue;
        System.out.println(result);

    }

}
