public class Teacher extends Person {

    public String school;

    public Teacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze Teacher");
        this.school = school;
    }

    public void techMath() {
        eat();
        walk();
        System.out.println("I'm teaching math in " + school);
    }

    public void sayHello(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
