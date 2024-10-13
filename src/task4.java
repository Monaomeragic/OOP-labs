import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int start = reader.nextInt();
        System.out.print("Enter last number: ");
        int end = reader.nextInt();
        if (start <= end) {
            while (start <= end) {
                System.out.println(start);
                start++;
            }
        } else {
            while (start >= end) {
                System.out.println(start);
                start--;
            }
        }
        reader.close();
    }
}
