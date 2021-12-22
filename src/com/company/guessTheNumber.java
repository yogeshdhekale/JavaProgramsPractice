package com.company;

import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        System.out.println("Lets play guess the number game");
        guessTheGame game = new guessTheGame();
        game.userInput();
        game.isGuessCorrect();
        game.getGuess();
    }
}

class guessTheGame{
    int computerInput;
    int userInput;
    int guess = 1;

    public guessTheGame(){
        Random number = new Random();
        computerInput = number.nextInt(100);
    }
    public void userInput(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Please enter a number");
        userInput = scan.nextInt();
    }
    public void isGuessCorrect(){
        if(computerInput == userInput){
            System.out.println("Great! You guessed correct number.");
        }
        else if(computerInput < userInput){
            System.out.println("User Input number is greater than computer input.");
            userInput();
            setGuess();
            isGuessCorrect();
        }
        else if(computerInput > userInput){
            System.out.println("User Input number is less than computer input.");
            userInput();
            setGuess();
            isGuessCorrect();
        }
        else {
            System.out.println("Please input valid number between 1 to 100.");
        }
    }
    public void setGuess() {
        guess++;
    }
    public void getGuess(){
        System.out.println("The number of guess attempts are " + guess);
    }
}