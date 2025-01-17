import java.util.Scanner;
public class Ch2Excercise3 {

    public static void main(String[] args) {   
        // Write a program that displays a menu with the following options on separate lines:
        // 1. Greet me
        // 2. Insult me
        // 3. Tell me a joke.
        // The program should ask the user for a selection from the menu and perform the selected action. Use a switch statement.
        // If the user enters anything other than one of the options, it should inform them that they've made an invalid selection.

        int userInput = 0;
        

        while(userInput != 4){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello! Please select on of the following options:");
            System.out.println("1. Greet Me");
            System.out.println("2. Insult Me");
            System.out.println("3. Tell Me a Joke");
            System.out.println("4. Exit");
            userInput = scanner.nextInt();

        
        
            switch (userInput) {
                case 1:
                    System.out.println("Hello User! How are you doing today?");
                    System.out.println("");

                    break;
             
                case 2:
                    System.out.println("You are incredibly putrid. It's so bad I can smell you through the computer. Please take a shower.");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("A Horse walks into a bar");
                    System.out.println("");
                    break;

        
            default:
                

        }

    }

      


        










    }
}
