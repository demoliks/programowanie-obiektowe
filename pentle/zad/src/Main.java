//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wybor;

        do {
            System.out.println("\n=== MENU PROGRAMU ===");
            System.out.println("1. Zadanie 1: Wyświetl liczby nieparzyste");
            System.out.println("2. Zadanie 2: Wyświetl potęgi liczby 2");
            System.out.println("3. Zadanie 3: Sumowanie liczb (0 kończy)");
            System.out.println("0. Wyjście z programu");
            System.out.print("Wybierz opcję: ");

            wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    System.out.print("Podaj liczbę całkowitą dodatnią: ");
                    int n1 = scanner.nextInt();
                    for (int i = 1; i <= n1; i += 2) {
                        System.out.print(i);
                        if (i + 2 <= n1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Podaj liczbę całkowitą dodatnią n: ");
                    int n2 = scanner.nextInt();
                    int potega = 1;
                    while (potega <= n2) {
                        System.out.print(potega + " ");
                        potega *= 2;
                    }
                    System.out.println();
                    break;

                case 3:
                    int suma = 0;
                    int liczba;
                    System.out.println("Podawaj liczby (0 kończy sumowanie):");
                    do {
                        liczba = scanner.nextInt();
                        suma += liczba;
                    } while (liczba != 0);
                    System.out.println("Suma podanych liczb wynosi: " + suma);
                    break;

                case 0:
                    System.out.println("Koniec programu. Do zobaczenia!");
                    break;

                default:
                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
            }
        } while (wybor != 0);

        scanner.close();
    }
}



