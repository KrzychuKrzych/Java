import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Podaj proszę dwie liczby: ");
        int a = number.nextInt();
        int b = number.nextInt();
        int dodawanie = a + b;
        int mnozenie = a * b;

        System.out.println("Wynik dodawania: " + dodawanie);
        System.out.println("Wynik mnozenia: " + mnozenie);

    }
}
