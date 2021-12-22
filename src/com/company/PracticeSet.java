package com.company;

import java.util.Scanner;

public class PracticeSet {

    public static void main(String[] args) {

        float f = 7/4.0f * 9/2.0f;
        System.out.println(f);

        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        Scanner scn = new Scanner(System.in);
        int a, b, c, max = 0;
        System.out.println("Enter 3 numbers for comparison");
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();

        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        }
            else {
                if (b > c) {
                    max = b;
                }
                else {
                    max = c;
            }
        }
        System.out.println("Biggest integer is " + max);

            //Swap the numbers
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped values are: " + "\n" + a + "\n" + b);
    }
}
