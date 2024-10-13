import java.util.Scanner;

public class task10{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 100: ");
        int targetNumber = reader.nextInt();

        while (targetNumber < 0 || targetNumber > 100) {
            System.out.print("Please enter a valid number between 0 and 100: ");
            targetNumber = reader.nextInt();
        }
        int guess;
        int numberOfGuesses = 0;
        do {
            System.out.print("Guess the number: ");
            guess = reader.nextInt();
            numberOfGuesses++;
            if (guess < targetNumber) {
                System.out.println("The number is greater.");
            } else if (guess > targetNumber) {
                System.out.println("The number is lower.");
            } else {
                System.out.println("Congratulations, your guess is correct!");
            }
        } while (guess != targetNumber);

        System.out.println("Total number of guesses: " + numberOfGuesses);

        reader.close();
    }
}
