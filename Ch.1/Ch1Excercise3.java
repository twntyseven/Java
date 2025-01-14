import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch1Excercise3 {
    public static void main(String[] args) {
        
// Zach Stern, a floor tiler doing business as Zach Stern's Tile, needs to know the area of any rectangular floor he's tiling. 
// He wants a program that asks for the room's length and width and the cost per square foot of tile.
// The program should calculate and display the room's area in square feet and the cost of the tile needed to cover the room.
//  Dollar values should be formatted to two decimal places with a dollar sign in front.

// Expected Output:

// The room is 300 square feet.

// At $25.00 per sq.ft., It will cost $7,500.00 to tile it. 

  Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the floor length:");
            int length = scanner.nextInt();

            System.out.println("Enter the floor width:");
            int width = scanner.nextInt();

            System.out.println("Enter the cost per tile:");
            double costPerTile = scanner.nextDouble();

            int sqrft = length * width;

            DecimalFormat df = new DecimalFormat("#.00"); 
            String totalPrice = df.format(sqrft * costPerTile);
            
            System.out.println("The room is " + sqrft + " square feet.");
            System.out.println("At $" + costPerTile + " per square feet, it will cost $" + (totalPrice) + " to tile it.");


    }
    
}
