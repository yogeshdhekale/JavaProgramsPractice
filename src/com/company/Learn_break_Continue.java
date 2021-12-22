package com.company;

public class Learn_break_Continue {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
            System.out.println(i);
            System.out.println("Java is good language.");
            if (i==4){
                System.out.println("Loop ends here");
                break;
            }
        }
        System.out.println("For loop has ended.");
    }
}
