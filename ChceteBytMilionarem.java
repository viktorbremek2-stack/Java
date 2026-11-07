
import java.util.Scanner;

public class ChceteBytMilionarem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean hraPokračuje = true;
        System.out.println("");
        System.out.println("Vítejte u soutěže Chcete být milionářem!");
        System.out.println("Čeká vás 15 otázek a můžete vyhrát 10 000 000 Kč!");
        System.out.println();

        // OTÁZKA 1
        System.out.println("První otázka za 1 000 Kč");

        System.out.println(
                "Kolik dní má běžný (nepřestupný) kalendářní rok? \n" +
                        "A) 364\n" +
                        "B) 365\n" +
                        "C) 366\n" +
                        "D) 367");

        System.out.print("Tvoje odpověď: ");
        String odpoved1 = scanner.nextLine();

        if (odpoved1.equalsIgnoreCase("B")) {
            System.out.println("To je správně! Máte 1 000 Kč");
        } else {
            System.out.println("Škoda! děkuji vám za skvělý výkon");
            hraPokračuje = false;
        }

        // OTÁZKA 2
        if (hraPokračuje) {
            System.out.println("\nDruhá otázka za 2 000 Kč");

            System.out.println(
                    "Která planeta je největší ve Sluneční soustavě? \n" +
                            "A) Země\n" +
                            "B) Saturn\n" +
                            "C) Jupiter\n" +
                            "D) Neptun");

            System.out.print("Tvoje odpověď: ");
            String odpoved2 = scanner.nextLine();

            if (odpoved2.equalsIgnoreCase("C")) {
                System.out.println("To je správně! Máte 2 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 3
        if (hraPokračuje) {
            System.out.println("\nTřetí otázka za 3 000 Kč");

            System.out.println(
                    "Kolik kostí má přibližně dospělý člověk? \n" +
                            "A) 186\n" +
                            "B) 206\n" +
                            "C) 226\n" +
                            "D) 246");

            System.out.print("Tvoje odpověď: ");
            String odpoved3 = scanner.nextLine();

            if (odpoved3.equalsIgnoreCase("B")) {
                System.out.println("To je správně! Máte 3 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 4
        if (hraPokračuje) {
            System.out.println("\nČtvrtá otázka za 5 000 Kč");

            System.out.println(
                    "Kdo namaloval obraz Mona Lisa? \n" +
                            "A) Pablo Picasso\n" +
                            "B) Vincent van Gogh\n" +
                            "C) Michelangelo\n" +
                            "D) Leonardo da Vinci");

            System.out.print("Tvoje odpověď: ");
            String odpoved4 = scanner.nextLine();

            if (odpoved4.equalsIgnoreCase("D")) {
                System.out.println("To je správně! Máte 5 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 5
        if (hraPokračuje) {
            System.out.println("\nPátá otázka za 10 000 Kč");

            System.out.println(
                    "Jaké je hlavní město Austrálie? \n" +
                            "A) Canberra\n" +
                            "B) Sydney\n" +
                            "C) Melbourne\n" +
                            "D) Perth");

            System.out.print("Tvoje odpověď: ");
            String odpoved5 = scanner.nextLine();

            if (odpoved5.equalsIgnoreCase("A")) {
                System.out.println("To je správně! Máte 10 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 6
        if (hraPokračuje) {
            System.out.println("\nŠestá otázka za 20 000 Kč");

            System.out.println(
                    "Který oceán je největší na Zemi? \n" +
                            "A) Atlantský\n" +
                            "B) Indický\n" +
                            "C) Tichý\n" +
                            "D) Severní ledový");

            System.out.print("Tvoje odpověď: ");
            String odpoved6 = scanner.nextLine();

            if (odpoved6.equalsIgnoreCase("C")) {
                System.out.println("To je správně! Máte 20 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 7
        if (hraPokračuje) {
            System.out.println("\nSedmá otázka za 40 000 Kč");

            System.out.println(
                    "Ve kterém roce skončila druhá světová válka? \n" +
                            "A) 1943\n" +
                            "B) 1945\n" +
                            "C) 1947\n" +
                            "D) 1950");

            System.out.print("Tvoje odpověď: ");
            String odpoved7 = scanner.nextLine();

            if (odpoved7.equalsIgnoreCase("B")) {
                System.out.println("To je správně! Máte 40 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 8
        if (hraPokračuje) {
            System.out.println("\nOsmá otázka za 80 000 Kč");

            System.out.println(
                    "Který chemický prvek má značku Hg? \n" +
                            "A) Stříbro\n" +
                            "B) Železo\n" +
                            "C) Olovo\n" +
                            "D) Rtuť");

            System.out.print("Tvoje odpověď: ");
            String odpoved8 = scanner.nextLine();

            if (odpoved8.equalsIgnoreCase("D")) {
                System.out.println("To je správně! Máte 80 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 9
        if (hraPokračuje) {
            System.out.println("\nDevátá otázka za 160 000 Kč");

            System.out.println(
                    "Kdo napsal román Zločin a trest? \n" +
                            "A) Lev Nikolajevič Tolstoj\n" +
                            "B) Fjodor Michajlovič Dostojevskij\n" +
                            "C) Anton Pavlovič Čechov\n" +
                            "D) Nikolaj Vasiljevič Gogol");

            System.out.print("Tvoje odpověď: ");
            String odpoved9 = scanner.nextLine();

            if (odpoved9.equalsIgnoreCase("B")) {
                System.out.println("To je správně! Máte 160 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 10
        if (hraPokračuje) {
            System.out.println("\nDesátá otázka za 320 000 Kč");

            System.out.println(
                    "Která země má nejvíce časových pásem, pokud započítáme i její zámořská území? \n" +
                            "A) Rusko\n" +
                            "B) USA\n" +
                            "C) Francie\n" +
                            "D) Čína");

            System.out.print("Tvoje odpověď: ");
            String odpoved10 = scanner.nextLine();

            if (odpoved10.equalsIgnoreCase("C")) {
                System.out.println("To je správně! Máte 320 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 11
        if (hraPokračuje) {
            System.out.println("\nJedenáctá otázka za 640 000 Kč");

            System.out.println(
                    "Jak se nazývá nejhlubší známé místo světového oceánu? \n" +
                            "A) Mariánský příkop – Challenger Deep\n" +
                            "B) Tonga příkop\n" +
                            "C) Portorický příkop\n" +
                            "D) Filipínský příkop");

            System.out.print("Tvoje odpověď: ");
            String odpoved11 = scanner.nextLine();

            if (odpoved11.equalsIgnoreCase("A")) {
                System.out.println("To je správně! Máte 640 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 12
        if (hraPokračuje) {
            System.out.println("\nDvanáctá otázka za 1 250 000 Kč");

            System.out.println(
                    "Který panovník vydal v roce 1212 Zlatou bulu sicilskou? \n" +
                            "A) Karel IV.\n" +
                            "B) Václav II.\n" +
                            "C) Přemysl Otakar II.\n" +
                            "D) Fridrich II.");

            System.out.print("Tvoje odpověď: ");
            String odpoved12 = scanner.nextLine();

            if (odpoved12.equalsIgnoreCase("D")) {
                System.out.println("To je správně! Máte 1 250 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 13
        if (hraPokračuje) {
            System.out.println("\nTřináctá otázka za 2 500 000 Kč");

            System.out.println(
                    "Který měsíc má v židovském kalendáři svátek Jom kipur? \n" +
                            "A) Nisan\n" +
                            "B) Tišri\n" +
                            "C) Kislev\n" +
                            "D) Adar");

            System.out.print("Tvoje odpověď: ");
            String odpoved13 = scanner.nextLine();

            if (odpoved13.equalsIgnoreCase("B")) {
                System.out.println("To je správně! Máte 2 500 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 14
        if (hraPokračuje) {
            System.out.println("\nČtrnáctá otázka za 5 000 000 Kč");

            System.out.println(
                    "Který matematik je spojován s důkazem poslední Fermatovy věty z roku 1994? \n" +
                            "A) Carl Friedrich Gauss\n" +
                            "B) Leonhard Euler\n" +
                            "C) Andrew Wiles\n" +
                            "D) Alan Turing");

            System.out.print("Tvoje odpověď: ");
            String odpoved14 = scanner.nextLine();

            if (odpoved14.equalsIgnoreCase("C")) {
                System.out.println("To je správně! Máte 5 000 000 Kč");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
                hraPokračuje = false;
            }
        }

        // OTÁZKA 15
        if (hraPokračuje) {
            System.out.println("\nPatnáctá otázka za 10 000 000 Kč");

            System.out.println(
                    "Která starověká civilizace jako první vytvořila známý systém klínového písma? \n" +
                            "A) Sumerové\n" +
                            "B) Féničané\n" +
                            "C) Egypťané\n" +
                            "D) Chetité");

            System.out.print("Tvoje odpověď: ");
            String odpoved15 = scanner.nextLine();

            if (odpoved15.equalsIgnoreCase("A")) {
                System.out.println("GRATULUJI! VYHRÁVÁTE 10 000 000 Kč!!!");
            } else {
                System.out.println("Škoda! děkuji vám za skvělý výkon");
            }
        }

        scanner.close();
    }
}
