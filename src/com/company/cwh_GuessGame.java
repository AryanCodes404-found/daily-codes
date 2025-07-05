package com.company;

import java.util.Random;
import java.util.Scanner;

class Game1 {
    int number;
    int inputNumber;
    int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game1() {
        Random r = new Random();
        number = r.nextInt(10);  // Random number between 0 and 9
    }

    void takeUserInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Guess the number between (0-9): ");
        inputNumber = s.nextInt();
    }

    boolean isCorrect() {
        setNoOfGuesses(getNoOfGuesses()+1);
        if (inputNumber == number) {
            System.out.println("Correct! You guessed it in " + noOfGuesses + " attempts.");
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class cwh_GuessGame {
    public static void main(String[] args) {
        Game1 g = new Game1();
        boolean b = false ;
        while (!b) {
            g.takeUserInput();
            b= g.isCorrect();
        }
    }
}
