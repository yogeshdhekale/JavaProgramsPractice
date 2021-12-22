package com.company;

import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {
        int age;
        System.out.println("Pleae enter your age");
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();

        switch (age){
            case 18:
                System.out.println("Young");
                break;
            case 23:
                System.out.println("Graduation");
                break;
            case 36:
                System.out.println("Adult");
                break;
            case 60:
                System.out.println("Old Age");
                break;
            default:
                System.out.println("Baby");
        }
    }
}
