public class Tablica {

    public static void main(String[] args) {
        String[] nazwaTablicy = new String[3]; //w nawiasie podaje ilosc elementow ktore posiada tablica

        nazwaTablicy[0] = "pierwszy rekord";
        nazwaTablicy[1] = "drugi rekord";
        nazwaTablicy[2] = "trzeci rekord";

        System.out.println(nazwaTablicy[2]);

        int[] nowaNazwaTablicy = new int[] {1,2,3,5,6}; //w nawiasie klamrowym podaje wartosci przypisane do tablicy

        System.out.println(nowaNazwaTablicy.length);

        for (int i = 0; i < nazwaTablicy.length; i++)
        {
            System.out.println(nazwaTablicy[i]);
        }

    }
}
