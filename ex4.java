import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int target = r.nextInt(100) + 1; // random number 1 to 100

        while (true) {
            System.out.print("Enter your guess (1-100): ");
            int guess = sc.nextInt();

            if (guess == target) {
                System.out.println("Correct Guess!");
                break;
            } else if (guess < target) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
        }
    }
}
