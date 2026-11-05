
import java.util.Scanner;

public class PrvniProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadej jmeno: ");
        String name = scanner.nextLine();

        System.out.print("Zadej vek: ");
        int age = scanner.nextInt();

        System.out.println("Ahoj " + name);
        System.out.println("Za 5 let ti bude " + (age + 5) + " let.");

        System.out.println("Tvoje programatorska uroven je 7");

        scanner.close();
    }
}
