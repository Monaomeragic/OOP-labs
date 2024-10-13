import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.print("Enter number: ");
            number = reader.nextInt();
            if (number != 0) {
                sum += number;
            }
        } while (number != 0);
        System.out.println("The sum is: " + sum);

        reader.close();
    }
}
