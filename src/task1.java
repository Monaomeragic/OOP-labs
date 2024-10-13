import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String correctpass = "carrot";
        Scanner reader = new Scanner(System.in);
        String userInput = "";
        while (!userInput.equals(correctpass)) {
            System.out.println("Enter password: ");
            userInput = reader.nextLine();
        }
        System.out.println("Right!!!! Secret is: 'Be happy'");
        reader.close();
    }
}
