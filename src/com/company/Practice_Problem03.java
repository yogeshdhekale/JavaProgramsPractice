package com.company;

import java.util.Scanner;

public class Practice_Problem03 {
    public static void main(String[] args) {
        System.out.println("Please enter input number:");
        Scanner scn = new Scanner(System.in);
        int inputNumer = scn.nextInt();
        System.out.println(inputNumer>10);

        System.out.println("**************************");
        int i, length;
        String reverse = "";
        String str = "Infosys is my second company.";
        length = str.length();
        for (i=length-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("**************************");
        String str1 = "Cognizant Solutions Ltd";
        StringBuilder str2 = new StringBuilder(str1);
        StringBuilder reverse2 = str2.reverse();
        System.out.println(reverse2);

        int a, b, c, max;
        Scanner scnInput = new Scanner(System.in);
        System.out.println("Please enter 3 input numbers to compare:");
        a = scnInput.nextInt();
        b = scnInput.nextInt();
        c = scnInput.nextInt();

        max = maxNumber(maxNumber(a, b), c);
        System.out.println(max);
    }
    public static int maxNumber (int num1, int num2){
        if (num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}
