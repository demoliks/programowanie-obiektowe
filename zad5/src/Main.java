import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj ciąg znaków: ");
        String tekst1 = scanner.nextLine();

        if (tekst1.isEmpty()) {
            System.out.println("Podany ciąg jest pusty.");
        } else {
            char ostatniZnak = Character.toLowerCase(tekst1.charAt(tekst1.length() - 1));
            String tekstDoAnalizy = tekst1.toLowerCase();
            int licznik = 0;

            for (int i = 0; i < tekstDoAnalizy.length(); i++) {
                if (tekstDoAnalizy.charAt(i) == ostatniZnak) {
                    licznik++;
                }
            }
            System.out.println("Wynik: " + licznik);
        }
        System.out.println();


        System.out.print("Podaj ciąg znaków: ");
        String tekst2 = scanner.nextLine();

        String odwrocony = new StringBuilder(tekst2).reverse().toString();
        System.out.println("Wynik: " + odwrocony);
        System.out.println();

      
        System.out.print("Podaj tekst z liczbami: ");
        String tekst3 = scanner.nextLine();

        long sumaLiczb = 0;
        String[] tokeny = tekst3.split("\\D+");
        for (String token : tokeny) {
            if (!token.isEmpty()) {
                sumaLiczb += Long.parseLong(token);
            }
        }

        long sumaCyfrWyniku = 0;
        String sumaStr = String.valueOf(sumaLiczb);
        for (char c : sumaStr.toCharArray()) {
            if (Character.isDigit(c)) {
                sumaCyfrWyniku += Character.getNumericValue(c);
            }
        }
        System.out.println("Wynik: " + sumaCyfrWyniku);
        System.out.println();


        System.out.print("Podaj wyrażenie arytmetyczne: ");
        String wyrazenie = scanner.nextLine();

        int bilans = 0;
        boolean poprawne = true;

        for (char c : wyrazenie.toCharArray()) {
            if (c == '(') {
                bilans++;
            } else if (c == ')') {
                bilans--;
                if (bilans < 0) {
                    poprawne = false;
                    break;
                }
            }
        }

        if (bilans != 0) {
            poprawne = false;
        }

        if (poprawne) {
            System.out.println("Wynik: OK");
        } else {
            System.out.println("Wynik: Błędne sparowanie nawiasów");
        }

        scanner.close();
    }
}
