package com.company;

public class Learn_methods {
    static int sum (int a, int b){
        int sum = a + b;
        return sum;
    }
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int fact = n * factorial(n-1);
            return fact;
        }
    }

    static int factorial_forLoop(int a){
        if (a == 0 || a == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i =1; i<=a; i++){
                product = product * i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        //Learn_methods obj = new Learn_methods();
        int addition = sum(12,5);
        System.out.println(addition);
        int y = 2;
        int x = factorial(y);
        System.out.println("Factorial of " + y + " is " + x);

        int m = factorial_forLoop(1);
        System.out.println(m);
    }
}