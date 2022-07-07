import java.util.Scanner;

public class pytanieOWiek {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Podaj swój wiek, a ja powiem czy możesz kupić alkohol:");
        int wiek = number.nextInt();

        if(wiek >= 18) {
            System.out.println("Możesz kupić alkohol!");
        } else if(wiek < 18) {
            System.out.println("Masz za mało lat;(");
        }
    }
}
