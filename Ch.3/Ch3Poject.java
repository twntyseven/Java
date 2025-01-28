import java.util.Scanner;
public class Ch3Poject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of an integer between 1-1000");
        System.out.println("After I guess, let me know how close I was by entering:");
        System.out.println("Higher (h)");
        System.out.println("Lower (l)");
        System.out.println("Correct (c)");
        System.out.println("Higher (h)");
        System.out.println("Press enter and I will start guessing...");
        String userIn = scanner.nextLine();

        double guess = 500;
        double possible_values = 500.0;

        
        

        if(userIn == ""){
            while(!userIn.equals("c")){

                System.out.println("Beep-Boop, Is your number " + (int)guess + "?");
                userIn = scanner.nextLine();

                if(userIn.equals("h")){
                    possible_values = Math.ceil(possible_values / 2.0);
                    guess += possible_values;
                }

                else if(userIn.equals("l")){
                    possible_values = Math.floor(possible_values / 2.0);
                    guess -= possible_values;
                }
            }

        }

        for(int x = 1; x <= guess; x++){
            System.out.println(x + " Hip-Hip-Hooray!");

        }
        
        System.out.println("Yay!");
    }
    
}
