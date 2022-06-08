import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Podaj prosze pierwsza liczbe: ");
        int a = number.nextInt();
        System.out.println("Podaj prosze druga liczbe: ");
        int b = number.nextInt();

        Calculator calculator = new Calculator();

        int dodawanie = calculator.dodawanie(a, b);
        int odejmowanie = calculator.odejmowanie(a,b);
        int mnozenie = calculator.mnozenie(a,b);
        int mod = calculator.mod(a,b);

        System.out.println("Wynik dodawania: " + dodawanie);
        System.out.println("Wynik odejmowania: " + odejmowanie);
        System.out.println("Wynik mnozenia: " + mnozenie);
        System.out.println("Wynik modulo: " + mod);

    }
}
