
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Random random = new Random();

        int num = 0;
        for (int i = 0; i < 1; i++) {
            num = (1 + random.nextInt(50));
        }

//        System.out.println(num);
        Scanner scan = new Scanner(System.in);
        int scoreCount = 0;

        while (true) {
            System.out.println("Please enter number to guess (from 1 to 50)");
            int playerGuess = scan.nextInt();
            scoreCount++;

            if (playerGuess == num) {
                System.out.println("Congratulations! You win!");
                System.out.println("Your score is: " + scoreCount);
                break;
            } else if (playerGuess < num) {
                System.out.println("Sorry! The number is higher...");
            } else {
                System.out.println("Sorry! The number is lower...");
            }
        }
        scan.close();
    }
}
