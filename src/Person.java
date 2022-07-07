public class Person {

    public String name;
    public int age;

    public Person(String name, int age){
        System.out.println("Jestem w konstruktorze Person");
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("I like eat pizza!");
    }

    public void walk() {
        System.out.println("I like walking!");
    }
}
