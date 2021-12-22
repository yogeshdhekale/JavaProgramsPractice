package com.company;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner yearEnter = new Scanner(System.in);
        System.out.println("Please enter an year, e.g. 1900");
        int year = yearEnter.nextInt();

        int rem4;
        int rem100;
        int rem400;

        rem4 = year % 4;
        rem100 = year % 100;
        rem400 = year % 400;

        if (rem100 == 0 && rem400!=0){
            System.out.println(year + " is not a leap year");
        }
        else if (rem400 == 0){
            System.out.println(year + " is a LEAP YEAR");
        }
        else if (rem4 == 0){
            System.out.println(year + " is a LEAP YEAR");
        }
        else {
            System.out.println(year + " is not a leap year");
        }

        Scanner scnWebsite = new Scanner(System.in);
        System.out.println("Please enter website name");
        String website = scnWebsite.next();

        if(website.endsWith(".org")){
            System.out.println("Orgnization website");
        }
        else if (website.endsWith(".in")){
            System.out.println("Indian website");
        }
        else if (website.endsWith(".gov")){
            System.out.println("Government website");
        }
        else if (website.endsWith(".com")){
            System.out.println("Commecial website");
        }
        else {
            System.out.println("Different website domain");
        }
    }

}
