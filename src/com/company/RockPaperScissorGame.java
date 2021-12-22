package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Random num = new Random();
        int a = num.nextInt(3);
        //System.out.println(a);
        Scanner sc = new Scanner(System.in);
        System.out.println("0 for rock\n1 for paper\n2 for scissor");
        int userInput = sc.nextInt();
        System.out.println("System input is " + a);
        if (a == userInput){
            System.out.println("Its a tie. Please play again.");
        }
        else if (a == 0){
            if (userInput == 1){
                System.out.println("User is winner");
            }
            else {
                System.out.println("User is looser");
            }
        }
        else if (a == 1){
            if (userInput == 0){
                System.out.println("User is looser");
            }
            else {
                System.out.println("User is winner");
            }
        }
        else if (a == 2){
            if (userInput == 0){
                System.out.println("User is winner");
            }
            else {
                System.out.println("User is looser");
            }
        }
    }
}