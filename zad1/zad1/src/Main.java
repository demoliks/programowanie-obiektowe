//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");

        String mojeImie = "Judyta";
        int rokUrodzenia = 2009;
        double wartoscUlamkowa = 0.66;

        System.out.println("Imię: " + mojeImie);
        System.out.println("Rok urodzenia: " + rokUrodzenia);
        System.out.println("Wartość: " + wartoscUlamkowa);

        int aktualnyRok = java.time.Year.now().getValue();
        int wiek = aktualnyRok - rokUrodzenia;


        System.out.println("Mam na imię " + mojeImie + ", mam " + wiek + " lat i będę pisać maturę za " + 2.5 + " roku.");
        System.out.println();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj aktualną temperaturę w stopniach Celsjusza: ");
        double stopnie = scanner.nextDouble();

        double fahrenheity = 1.8 * stopnie + 32.0;
        System.out.println(stopnie + " stopni Celsjusza to " + fahrenheity + " stopni Fahrenheita.");

        scanner.close();
    }
}

