import java.util.Scanner;
public class task6 {

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How many times do you want to print the text: ");
        int times = reader.nextInt();

        for (int i = 0; i < times; i++) {
            printText();
        }

        reader.close();
    }
}
