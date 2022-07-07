package Exceptions;

public class ExceptionsExample {

    public static void main(String[] args) {

        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 2;

        for (int i=0; i < numbers.length; i++) { // błąd wywołuje znak <= gdyż tablica posiada dwa elementy (0,1), a nie 3 (przez .length)
            System.out.println(numbers[i]);
        }
    }
}
