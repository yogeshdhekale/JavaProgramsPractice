package com.company;

import javax.security.auth.Subject;
import java.util.Scanner;

public class Percentage_Marks {
    int max_marks = 100;
    int obtd;

    public static void main(String[] args) {

        Percentage_Marks s1 = new Percentage_Marks();
        System.out.println("Please enter marks of Hindi");
        Scanner scn1 = new Scanner(System.in);
        s1.obtd = scn1.nextInt();

        Percentage_Marks s2 = new Percentage_Marks();
        System.out.println("Please enter marks of English");
        Scanner scn2 = new Scanner(System.in);
        s2.obtd = scn2.nextInt();
        s2.obtd = scn2.nextInt();



        Percentage_Marks s3 = new Percentage_Marks();
        System.out.println("Please enter marks of Physics");
        Scanner scn3 = new Scanner(System.in);
        s3.obtd = scn3.nextInt();

        Percentage_Marks s4 = new Percentage_Marks();
        System.out.println("Please enter marks of Maths");
        Scanner scn4 = new Scanner(System.in);
        s4.obtd = scn4.nextInt();

        Percentage_Marks s5 = new Percentage_Marks();
        System.out.println("Please enter marks of Chemistry");
        Scanner scn5 = new Scanner(System.in);
        s5.obtd = scn5.nextInt();

        int total_marks = s1.obtd + s2.obtd + s3.obtd + s4.obtd + s5.obtd;

        double percentage = total_marks*100/500;

        System.out.println("Total % marks are " + percentage);
    }
}
