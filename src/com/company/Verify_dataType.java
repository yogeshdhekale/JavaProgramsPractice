package com.company;

import java.util.Scanner;

public class Verify_dataType {

    public static void main(String[] args) {

        System.out.println("Enter an integer number");
        Scanner scn = new Scanner(System.in);
       // int a  = scn.nextInt();
        System.out.println(scn.hasNextInt());
    }
}
