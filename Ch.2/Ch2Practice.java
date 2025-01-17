
    
    import java.util.Scanner;
    public class Ch2Practice{
        public static void main(String[] args) {
            // Declare a boolean variable called canVote and assign it an appropriate value.
            int canVote = 18;

            //  Declare two int variables and assign values of your choice. Write a conditional statement to test whether the two values are equal, if true output "true", or if false output "false"
            int num = 20;
            int num2 = 23;


            if (num == num2){
                System.out.println("true");
            }
            else{
                System.out.println("false");

            }

            //  Declare 2 int variables and assign them an int value between 1 and 999
            // Declare another int variable and assign it an int value between 1 and 999
            int x = 21;
            int y = 6;
            int z = 144; 

            // Write conditional statements to output which value is larger.
            // Write conditional statements to output which value is in the middle.


            if(Math.max(x,y) == x && Math.max(x,z)  == x){
                System.out.println(x);
                
            }
            else if(Math.max(x,y) == y && Math.max(y,z)  == y){
                System.out.println(y);
                
            }
            else if(Math.max(z,y) == z && Math.max(x,z)  == z){
                System.out.println(z);
                
            }
            if((x > y && x < z) || (x < y && x > z)) {
                System.out.println("Mid: " + x);
            }
            else if((y > x && y < z) || (y < x && y > z)) {
                System.out.println("Mid: " + y);
            }
            else {
                System.out.println("Mid: " + z);
            }


            // Declare a variable called selection with the value of 2. Use a  switch statement to accomplish the following: 
            // If the user enters 1, display a message saying the color is yellow. If the user enters  2, display a message saying the color is blue. 
            // If the user enters  3, display a message saying the color is red. If the user input is not 1, 2, or 3, display a message saying the selection was invalid

            int selection = 2;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number 1-3");
            int userInput = scanner.nextInt();

            switch(selection){

    

                case 1:
                    System.out.println("The color is yellow");
                    break;

                case 2:
                    System.out.println("The color is blue");
                    break;

                case 3:
                    System.out.println("The color is red");
                    break;

                default:
                    System.out.println("Invalid selection");
                    break;


            }

        }

    }





    

  
    // Declare a variable called selection with the value of 2. Use a  switch statement to accomplish the following: If the user enters 1, display a message saying the color is yellow. If the user enters  2, display a message saying the color is blue. If the user enters  3, display a message saying the color is red. If the user input is not 1, 2, or 3, display a message saying the selection was invalid
