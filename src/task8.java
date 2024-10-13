import java.util.Scanner;

public class task8 {
    public static void drawInvertedStarsPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = reader.nextInt();
        drawInvertedStarsPyramid(rows);

        reader.close();
    }
}
