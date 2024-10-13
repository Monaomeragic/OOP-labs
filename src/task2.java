import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = reader.nextInt();

        System.out.print("Enter the second number: ");
        int num2 =reader.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = reader.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("The sum of the three numbers is: " + sum);
        reader.close();
    }
}

