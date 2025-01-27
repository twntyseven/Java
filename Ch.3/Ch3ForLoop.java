import java.util.Scanner;
public class Ch3ForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number 100-999:");
        int max = scanner.nextInt();

        for(int count = 13; count < max; count += 13){
            System.out.println(count);
        }
    }
    
}
