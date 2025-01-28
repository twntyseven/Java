import java.util.Scanner;
public class Ch4ArrayProject {
    public static void main(String[] args) {

        String[] adjective = new String[]{ "Bright", "Quiet", "Quick", "Strong", "Creative", "Gentle", "Smart", "Brave", "Calm", "Happy", "Loud", "Soft", "Bold", "Curious", "Honest"};
        String[] nounIdea = new String[]{"Boredom", "Thought", "Life", "Travel", "Memory", "Emotion", "Hope", "Freedom", "Curiosity", "Justice", "Fear", "Time", "Energy", "Desire", "Wisdom"};
        String[] nounObject = new String[]{"Car", "Pencil", "Fork", "Bird", "Bottle", "Barrel", "Shoe", "Crate", "Piano", "Anvil", "Plate", "Knife", "Apple", "Magnet", "Lamp"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many product names would you like?");
        int numOfItems = scanner.nextInt();
        
        System.out.println("The " + numOfItems + " generated products!");
        System.out.println("-------------------------");

        for(int x = 0; x < numOfItems; x++){
            System.out.println(adjective[(int)(Math.random() * 15)] + " " + nounIdea[(int)(Math.random() * 15)] + " " + nounObject[(int)(Math.random() * 15)]);
        }
    }
}
