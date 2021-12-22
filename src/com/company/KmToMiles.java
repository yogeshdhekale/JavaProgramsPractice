package com.company;

import java.util.Scanner;

public class KmToMiles {

    public static void main(String[] args) {

        System.out.println("Please enter value of KM");
        Scanner scn = new Scanner(System.in);

        double km = scn.nextDouble();

        double miles = km * 0.621371;

        System.out.println(km + "KM" + " to miles is " + miles);

        int b = 60/5-34*2;
        System.out.println(b);
    }
}
