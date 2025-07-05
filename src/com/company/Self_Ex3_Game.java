package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {
    int compInput,userInput,noOfGuess;

public Game(){
    Random gc=new Random();
    this.compInput= gc.nextInt(15);
}
public void UserInput(int n){
    userInput=n;
}
public boolean isCorrectNumber() {
        noOfGuess++;
        if (userInput > compInput) {
            System.out.println("Too high!");
            return false;
        } else if (userInput < compInput) {
            System.out.println("Too low!");
            return false;
        } else {
            System.out.println("🎉 Bingo! You guessed it right.");
            System.out.println("Total attempts: " + noOfGuess);
            return true;
        }
    }
}

public class Self_Ex3_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game player = new Game();
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess the number between 1 to 10");
        boolean correct = false;
        while (!correct) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            player.UserInput(guess);
            correct = player.isCorrectNumber();
        }
        sc.close();
    }
}

