package com.company;

public class LearningLoops {
    public static void main(String[] args) {
        int i = 0;
        while (i<=3){
            System.out.println(i);
            i++;
        }
        System.out.println("***********************");
        int b = 10;
        do {
            System.out.println(b);
            b++;
        }
        while(b<5);
        System.out.println("*********** do while loop ************");
        int c = 1;
        do {
            System.out.println(c);
            c++;
        }while (c<7);

        System.out.println("********** For loop ************");

        int d;
        for (d=0; d<8; d++){
            System.out.println(d);
        }

        System.out.println("********** For loop Print Odd numbers ************");

        int e = 6;
        for (i=0; i<e; i++){
            System.out.println(i*2+1);
        }

        System.out.println("********** For loop Print numbers in reverse order ************");

        for(int f = 10; f>0; f--){
            System.out.println(f);
        }
    }
}
