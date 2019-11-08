package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一字串(<100)");
        String inputstring = scanner.next();
        String LongestStandard = "";
        int LongestLength=0;
        System.out.println(inputstring);
        System.out.println(inputstring.substring(1, 3));
        int InputstringLength = inputstring.length();

        for (int i = 0; i < InputstringLength; ) {
            for (int j = 2; j < InputstringLength + 1; ) {
                if (inputstring.lastIndexOf(inputstring.substring(i, j)) == i) {//後面沒有相同的
                    i++;
                    j = i + 2;
                    if (j >= InputstringLength + 1) {
                        i = InputstringLength;
                    }
                } else {
                    int LN=inputstring.substring(i, j).length();
                    if ( LN> LongestLength) {
                        LongestStandard = inputstring.substring(i, j);
                        LongestLength=LN;
                    }
                    else if( LN== LongestLength){
                        LongestStandard=LongestStandard+","+inputstring.substring(i, j);
                    }
                    j++;
                }
            }
        }
        System.out.println("最常重複字串:"+LongestStandard);

    }

}
