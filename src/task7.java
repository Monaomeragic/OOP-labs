import java.util.Scanner;

public class task7 {

    public static void drawStarsPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
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
        drawStarsPyramid(rows);
        reader.close();
    }
}
