import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstInteger = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int secondInteger = scanner.nextInt();
        int sum = firstInteger + secondInteger;
        System.out.println("The sum of " + firstInteger + " and " + secondInteger + " is: " + sum);
        scanner.close();
    }
}
