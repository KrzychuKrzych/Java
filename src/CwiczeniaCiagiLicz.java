public class CwiczeniaCiagiLicz {

    public static void main(String[] args) {

        for (int i=1; i < 5; i++) {
            if (i % 3 == 0)
            System.out.println(i);
        }
        int[] tablica = new int[] {1,3,5,7,0};

        for (int i=0; i<(tablica.length/2); i++) { //dzielenie tablicy na pol, zeby ostatnie dwie wartosci zmienic z dwiema pierwszymi
            int temp = tablica[i]; //dla i=0
            tablica[i] = tablica[tablica.length-1-i];
            tablica[tablica.length-1-i] = temp;
        }

        for (int i=0; i< tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}
