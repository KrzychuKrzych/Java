package ImplementationExercises;

import java.util.*;

public class ExceptionChecked {

    public static void main(String[] args) throws InvalidAgeException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek: ");
        int age = scanner.nextInt();

        if (age<0) {
            throw new InvalidAgeException("Your age is valid. ");
        }
        if (age>=18) {
            System.out.println("Jestes pelnoletni");
        } else {
            System.out.println("Nie jestes pelnoletni");
        }

    }
}
