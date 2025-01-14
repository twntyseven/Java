import java.util.Scanner;
public class Ch1Excercise2 {
    public static void main(String[] args) {

        // Brianna Watt, a consultant doing business as Watt Gives, wants a program to create an invoice for consulting services. 
        // Normally, she works on a project for three days before sending an invoice. She writes down the number of hours worked on each day and needs a program that asks for these amounts, totals them, and multiplies the amount by her standard rate of $30.65 per hour. 
        // The invoice should include Brianna's business name, the client's business name, the total number of hours worked, the rate, and the total amount billed. The information will be displayed onscreen.
        // Expected Output:


        // Brianna Watt DBA Watt Gives
        // Invoice for Grunge Inc. 
        // Hours: 20
        // Rate: $30.65
        // Total: $613

        
            Scanner scanner = new Scanner(System.in);
            int totalHours = 0;
            double rate = 30.65;

            
            System.out.println("Enter your hours worked:");
            int hours= scanner.nextInt();
            totalHours = totalHours + hours;

            System.out.println("Enter your hours worked:");
            int hours2= scanner.nextInt();
            totalHours = totalHours + hours;

            System.out.println("Enter your hours worked:");
            int hours3= scanner.nextInt();
            totalHours = hours + hours2 + hours3;


            System.out.println("Brianna Watt DBA Watt Gives");
            System.out.println("Hours: " + totalHours);
            System.out.println("Rate: $" + rate);
            System.out.println("Total: $" + (totalHours * rate));


    }
    
}
