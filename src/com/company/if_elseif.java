package com.company;

import java.util.Scanner;

public class if_elseif {

    public static void main(String[] args) {

        int age;
        System.out.println("Enter your age:");
        Scanner ageEntry = new Scanner(System.in);
        age = ageEntry.nextInt();
        if(age>56){

            System.out.println("Expert");
        }
        else if (age > 45){
            System.out.println("Professional");
        }
        else if (age > 36){
            System.out.println("Entry level");
        }
        else {
            System.out.println("Fresher");
        }
        System.out.println();
    }
}
