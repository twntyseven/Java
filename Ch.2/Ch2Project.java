import java.text.DecimalFormat;
import java.util.Scanner;;
public class Ch2Project {

    public static void main(String[] args) {

        // Chudson Hughes runs a potato bar. Chudson's head cashier, Jeremiah Jumbalaya, keeps forgetting the price of each fixin' so Chudson wants a program that will tell his cashiers how much to add based on the fixin's.
        // A sandwich can have up to 3 fixin's. If the fixin's add up to at least a dollar, the customer gets a 10% discount.
        
        // The fixin's add the following costs to the sandwich:
        // yogurt adds $1.00,
        // tomato adds $0.50,
        // lettuce adds $.30,
        // skittles add $0.75
        // Write a program that will ask the cashier for each of the 3 fixin's. It should calculate and display the total cost of toppings, the discount if applicable, and the total including discount.
        
        
        // Example Outputs:
        // <<Please enter first topping: skittles
        // <<Please enter second topping: lettuce
        // <<Please enter third topping: tomato
        // >>Your toppings cost $1.55
        // >>You saved $0.15!
        // >>Your total is $1.40
        
        // <<Please enter first topping: sand
        // <<Please enter second topping: lettuce
        // <<Please enter third topping: sprinkles
        // >>Your toppings cost $0.30

        // I feel like I've made this in html before...

        double total = 0.00;
        String count = "first";

        Scanner scanner = new Scanner(System.in);

        for(int x = 0; x < 3; x++){
            if(x == 1){count ="second";}
            else if(x == 2){count = "third";}

            System.out.println("Please enter a " + count + " topping:");
            String topping = scanner.nextLine();

            if(topping.equals("yogurt")){
                total += 1.00;
            }
            else if(topping.equals("tomato")){
                total += 0.50;
            }
            else if(topping.equals("lettuce")){
                total += 0.30;
            }
            else if(topping.equals("skittles")){
                total += 0.75;
            }

        }

        DecimalFormat df = new DecimalFormat("#.00"); // Format the total into 0.00
        String StringTotal = df.format(total);

        System.out.println("Your toppings cost $" + StringTotal);

            if(total >= 1.00){ 
                
                String saving = df.format(total * .1); 
                
                System.out.println("You saved $" + saving + "!"); // Print the amount saved

                String newTotal = df.format(total * .9);
                System.out.println("Your total is $" + newTotal); // Print the new total 
            }


    }
    
}
