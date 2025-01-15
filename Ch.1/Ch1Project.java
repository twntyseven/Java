import java.text.DecimalFormat;
import java.util.Scanner;
public class Ch1Project {
    public static void main(String[] args) {

// The program should ask the user for the following data and store it in variables of the indicated data types:

// name - string
// first initial - character
// last initial - character
// a number - integer
// another number - integer

// The program should calculate the following arithmetic results for the numbers:

// number 1 plus number 2
// number 1 minus number 2
// number 1 times number 2
// number 1 divided by number 2

// The program should display the user's entered name followed by a tab and then both of the user's initials

// It should then display the calculations it performed along with the results.
// Any calculations which could result in decimal values should display 2 decimal places/

// Expected Output:


// >>Please enter your name: Jeremiah
// >>Please enter your first initial: J
// >>Please enter your last initial: J
// >>Please enter a number: 5
// >>Please enter another number: 10
// >>Jeremiah JJ
// >>5 + 10 = 15
// >>5 - 10 = -5
// >>5 * 10 = 50
// >>5 / 10 = .50

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your first initial:");
        char fInitial = scanner.next().charAt(0);

        System.out.println("Enter your last initial:");
        char lInitial = scanner.next().charAt(0);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        System.out.println("Enter a different number:");
        int num2 = scanner.nextInt();


        int sum = num + num2;
        int difference = num - num2;
        int product = num * num2;
        DecimalFormat df = new DecimalFormat("#.00"); 
        String quotient = df.format(num / (double)num2);

        System.out.println(name + " " + fInitial + lInitial);
        System.out.println(num + " + " + num2 +" = " + sum);
        System.out.println(num + " - " + num2 +" = " + difference);
        System.out.println(num + " * " + num2 +" = " + product);
        System.out.println(num + " / " + num2 +" = " + quotient);

    }
    
}
