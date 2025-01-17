// Write a program that will allow the user to guess a number between 1 and 10.
// The program will set a variable to the number to be guessed.
// It will then ask the user to enter a number and display whether the guess was too high, too low, or correct.

import java.util.Scanner;
public class Ch2Excercise{
    public static void main(String[] args) {

            int randNum = (int)(Math.random() * (10)) + 1;


            while (true){

            Scanner scanner = new Scanner(System.in);
            System.out.println("I've selected a random number 1-10, guess what the number could be:");
            int userGuess = scanner.nextInt();

            if(userGuess > randNum){
                System.out.println("Too High!");
            }
            else if(userGuess < randNum){
                System.out.println("Too Low!");
            }
            else{
                System.out.println("Correct!");
                break;
            }
        }

    }
}