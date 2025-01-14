import java.util.Scanner;
public class Ch1Excercise{
    public static void main(String[] args) {
// Employees at Chudson Radios have been told they'll get a bonus for meeting sales goals. The store manager has asked them to set their own goals. The employees want a program to help them understand realistic goals. 
// The program should ask them how many sales they wish to make and how many days they have. It will then calculate and display the number of sales they'd need to make each day in order to meet their goal.
// Expected Output:

// You will need to make 16.666666666666668 sales each day in order to reach your goal of 100 in 6 days




 Scanner scanner = new Scanner(System.in);


 System.out.println("Enter your goal in number of sales:");
 int sales = scanner.nextInt();

 System.out.println("Enter how many dyas you would like to complete your goal:");
 int days = scanner.nextInt();

 double totalSales = sales / days;

 System.out.println("You will need to make " + totalSales + " sales each day in order to reach your goal of " + sales + " sales in " + days + " days");

    }
}