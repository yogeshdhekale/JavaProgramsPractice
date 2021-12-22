package com.company;

public class Practice_Problem07 {

    static void multi_Table(int n){
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " " + n*i);
        }
    }
    static void pattern1(int a){
        for (int k=0; k<a; k++){
            for (int l=0; l<k+1; l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern2(int a){
        for (int k=a; k>0; k--){
            for (int l=0; l<k; l++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static int sumOfNuturalNumbers(int b){
        if (b == 1){
            return 1;
        }
        else if (b<=0){
            System.out.println(b + " is not a natural number.");
            return 0;
        }
        else
            return b + sumOfNuturalNumbers(b-1);
    }

    static int fiboSeries(int c){
//        if(c==1){
//            return 0;
//        }
//        else if (c==2){
//            return 1;
//        }
        if(c==1 || c==2){
            return c-1;
        }
        else {
            int fib = fiboSeries(c-1) + fiboSeries(c-2);
            return fib;
        }
    }
    public static void main(String[] args) {
       // multi_Table(19);
        //pattern2(2);
//     int recSum = sumOfNuturalNumbers(0);
//        System.out.println(recSum);
        int fibo = fiboSeries(02);
        System.out.println(fibo);

        int n = 4692629;
        int reversed = 0;
        while (n != 0){
            int lastDigit = n%10;
            reversed = reversed*10 + lastDigit;
            n = n/10;
        }
        System.out.println(reversed);

    }
}
