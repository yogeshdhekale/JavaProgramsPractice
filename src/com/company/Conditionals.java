package com.company;

public class Conditionals {

    public static void main(String[] args) {
        int age = 16;
        boolean condition = (age>=18);
        if (condition){
            System.out.println("You can drive.");
        }
        else {
            System.out.println("You can not drive.");
        }

        boolean a = true;
        boolean b = false;

        if (a || b){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
