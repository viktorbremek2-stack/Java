import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ukolnicek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> ukoly = new ArrayList<>();

        while (true) {

            System.out.println("========================\n" +
                    "       TO-DO LIST\n" +
                    "========================\n" +
                    "\n" +
                    "1. Přidat úkol\n" +
                    "2. Zobrazit úkoly\n" +
                    "3. Odstranit úkol\n" +
                    "4. Ukončit program\n" +
                    "\n" +
                    "Vyber si číslo:");
            int num = scanner.nextInt();

            if (num == 1) {
                System.out.println("Přidej úkol zde:");
                        scanner.nextLine();
                    ukoly.add(scanner.nextLine());
            }
            if (num == 2) {
                if (ukoly.isEmpty()) {
                    System.out.println("Zatím nemáš žádné úkoly.");
                } else {
                    System.out.println("Tvé úkoly:");

                    for (String ukol : ukoly) {
                        System.out.println("- " + ukol);
                    }
                }
            }
            if (num == 3) {
                System.out.println(ukoly);
                System.out.println("Jaký úkol chceš smazat?");

                scanner.nextLine();
                String ukol = scanner.nextLine();

                if (ukoly.remove(ukol)) {
                    System.out.println("Úkol byl odstraněn.");
                } else {
                    System.out.println("Tento úkol neexistuje.");

                }
            }
                if (num == 4) {return;}

        }
    }}
