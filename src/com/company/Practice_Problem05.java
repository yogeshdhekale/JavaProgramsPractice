package com.company;

public class Practice_Problem05 {
    public static void main(String[] args) {
        //Problem 1
        for(int i = 5; i>0; i--){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("***********************");
        //Problem 2
        int number = 5;
        int sum = 0;
        for (int j=0; j<number;j++){
            sum = sum + (2*j);
        }
        System.out.println(sum);
        System.out.println("***********************");
        //Using while loop
        int k =0;
        int num = 4;
        int sumEven = 0;
        while(k < num){
            sumEven = sumEven+(2*k);
            k++;
        }
        System.out.println(sumEven);
        System.out.println("***********************");
        //Print multiplication program
        number = 5;
        for (int l=1;l<11;l++){
            System.out.println(number + " * " + l + " = " + number*l);
        }

        System.out.println("***********************");

        number = 10;
        for (int m=10;m>1;m--){
            System.out.println(number + " * " + m + " = " + number*m);
        }

        System.out.println("***********************");

        //Factorial Problem
        int p = 5;
        int multiplication = 1;
        for(int n=1; n<=p; n++){
            multiplication *= n;
        }
        System.out.println(multiplication);
    }
}
