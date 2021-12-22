package com.company;

import java.util.Scanner;

public class Practice_Problem04 {
    public static void main(String[] args) {
//        byte physics, chemistry, maths;
//        Scanner marks = new Scanner(System.in);
//        System.out.println("Please enter marks of Physics.");
//        physics = marks.nextByte();
//
//        System.out.println("Please enter marks of Chemistry.");
//        chemistry = marks.nextByte();
//
//        System.out.println("Please enter marks of Maths.");
//        maths = marks.nextByte();
//
//        float marksAvg = (physics + chemistry + maths)/3.0f;
//        System.out.println(marksAvg);
//
//        if (marksAvg>=40 && physics>=33 && chemistry>=33 && maths>=33){
//            System.out.println("Congratulations ! You are passed");
//        }
//        else{
//            System.out.println("Sorry. You are failed");
//        }

        float tax = 0f;
        float income;
        System.out.println("Please enter your annual income in lakhs");
        Scanner incm = new Scanner(System.in);
        income = incm.nextFloat();
        if (income <= 2.5){
            tax = tax + 0;
        }
        else if (income > 2.5 && income <= 5){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income > 5 && income <= 10){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income > 10){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10f);
        }
        System.out.println("Total tax paid is " + tax);

        int day;
        Scanner enterDay = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        day = enterDay.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesda");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter number between 1 to 7");
        }
       }
}
