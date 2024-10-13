import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = reader.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (int)Math.pow(2, i);
        }

        System.out.println("The sum is: " + sum);

        reader.close();
    }
}
