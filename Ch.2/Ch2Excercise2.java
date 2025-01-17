import java.util.Scanner;
public class Ch2Excercise2 {
    public static void main(String[] args) {
        // Write a program that asks the user for the hour in a 24hr format. Greet the user for the morning, afternoon, or evening, depending on whether the hour is or later than 6, 12, or 18 respectively.
        // If the hour isn't within these ranges, wish the user a good day,

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hour in the military time format:");
        int hour = scanner.nextInt();

        if(hour >= 6 && hour < 12){
            System.out.println("Good Morning!");
        }
        else if(hour >= 12 && hour < 17){
            System.out.println("Good Afternoon!");
        }
        else if (hour >= 17 && hour < 21){
            System.out.println("Good Evening!");
        }
        else{
            System.out.println("Good Night!");
        }


    }
}