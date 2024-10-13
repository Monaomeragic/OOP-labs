import java.util.Scanner;

public class task9 {

    public static void drawNumberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = reader.nextInt();
        drawNumberPyramid(rows);
        reader.close();
    }
}
