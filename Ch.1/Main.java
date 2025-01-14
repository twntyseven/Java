
  
import java.text.DecimalFormat;
import java.util.Scanner; 
    public class Main{
        public static void main(String[] args) {
            
                // Declare a String variable called name.
                // Assign a value to the name variable.
            String name = "Zihaar"; 

                // Declare an integer variable called age and assign it an appropriate value
            int age = 18;

                // Declare a character variable called theCharacter and assign it an appropriate value
            char theCharacter[] = {'a'};
            
                // Declare a double variable called interestRate and assign it an appropriate value
            double interestRate = 5.42;

                // In the console display the value of each variable created so far
            System.out.println(name);
            System.out.println(age);
            System.out.println(theCharacter);
            System.out.println(interestRate);

                // Retrieve a value from the user and store it in a variable named userInput
            Scanner scanner = new Scanner(System.in);

            System.out.println("How many backflips can you perform in an hour?");
            int userInput = scanner.nextInt();
            

                // Declare a String variable called theName which has no initial value. Prompt the user to enter their name and assign that value to theName
            scanner.nextLine();

            String theName;
            System.out.println("Enter Your Name:");
            theName = scanner.nextLine();

                // Declare an integer variable called theAge and assign it a value retrieved from the user
            int theAge; 
            System.out.println("Enter Your Age:");
            theAge = scanner.nextInt();

                // Declare an integer variable called blinks with a value of 200 and an integer variable called minutes with a value of 7. Declare a double variable called blinksPerMinute and assign it the result of dividing blinks by minutes.
            int blinks = 200;
            int minutes = 7;
            double blinksPerMinute = blinks / minutes;

                // Declare a double variable called accountBalance and assign it a decimal value retrieved from the user. Display this value with only 2 decimal places in the console.
            double accountBalance = 0.00;
            System.out.println("Enter Your Account Balance:");
            accountBalance = scanner.nextDouble();

            DecimalFormat df = new DecimalFormat("#.00"); // I didn't know this existed, but its a super easy way to format any desired double input into a pattern
            String adjustedbalance = df.format(accountBalance);

            System.out.println(adjustedbalance);

        }

    }