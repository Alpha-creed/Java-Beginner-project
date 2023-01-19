package com.beginnerProject;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int numRandom(){
        Random generator = new Random();
        int numRand = generator.nextInt(100)+1;
        return numRand;
    }
    public static void main(String[] args) {
	// write your code here
        int numRandom;
        int numGuess;
        int numGuess1;
        int numGuess2;
        int numGuess3;


        String display1 = "!!!You guessed it right!!!";
        String display2="!!!Sorry,that is not correct!!!";
        String display3="!!!The correct number is ";



        String greeting1 = "!!Welcome to the Guessing Game!!!";
        String greeting2="!!!Where you get 3 chances to guess a number from 1 to 100 and see if you are right!!!";
        String prompt1 = "Would you like to play?";
        String choice1 ="1.Yes";
        String choice2="2.No";
        String prompt2="Please enter a number 1 to 100";
        String second = "Please enter your second guess";
        String last ="Please enter your last guess";
        String prompt3="Would you like to play again?";
        String goodbye1="!!Goodbye!!!";
        String goodbye2="!!!Thanks for playing!!!";
        int reply=0;
        int count =1;

        Scanner keyboard = new Scanner(System.in);
        System.out.println(greeting1);
        System.out.println("");
        System.out.println(greeting2);
        System.out.println("");
        System.out.println(prompt1);
        System.out.println(choice1);
        System.out.println(choice2);
        reply = keyboard.nextInt();
        while(reply ==1) {
            numRandom = numRandom();
            System.out.print(prompt2);
            numGuess1 = keyboard.nextInt();
            System.out.println("");
                            if (numGuess1 == numRandom) {
                    System.out.println("");
                    System.out.println(display1);
                    System.out.println("");
                } else {
                    if (numGuess1 < numRandom) {
                        numGuess = numGuess1;
                        System.out.println("");
                        System.out.println("!!!The user's guess " + numGuess + " was close");
                        System.out.println("");
                    } else if (numGuess1 > numRandom) {
                        numGuess = numGuess1;
                        System.out.println("");
                        System.out.println("!!!The user;s guess " + numGuess + " was too far from the correct answer");
                        System.out.println("");
                    }
                    System.out.println("");
                    System.out.println(display2);
                    System.out.println("");
                    System.out.println(display3 + numRandom + ".");
                    System.out.println("");
                }
                System.out.println(prompt3);
                System.out.println(choice1);
                System.out.println(choice2);
                reply = keyboard.nextInt();
                ++count;
                if (reply == 2) {
                    System.out.println(goodbye2);
                    System.out.println("The users score is " + count);

                }

        }
        for(;reply>=2;reply--){
            System.out.println(goodbye1);
        }

    }
}
