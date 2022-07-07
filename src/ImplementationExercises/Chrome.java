package ImplementationExercises;

public class Chrome implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram za pomoca Chroma");
    }

    @Override
    public void findElementBy() {
        System.out.println("Wyswietlam za pomoca Chroma");
    }
}
