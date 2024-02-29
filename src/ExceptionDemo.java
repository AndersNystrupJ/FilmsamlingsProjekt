import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tal = 0;
        boolean isInputCorrect = false;
        while (!isInputCorrect) {
            try {
                tal = scanner.nextInt();
                isInputCorrect = true;
                System.out.println("Så er vi her");
                System.out.println(tal);
            } catch (InputMismatchException ime) {
                System.out.println("Den går ikke");
                System.out.println("Prøv igen");
                scanner.nextLine();
            }
        }
    }
}
