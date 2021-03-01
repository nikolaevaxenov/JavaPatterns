package Flyweight;

public class ThirdHuman extends Human {
    public ThirdHuman() {
        firstName = "Петр";
        lastName = "Петров";
        age = 48;
    }

    @Override
    public void getInfo() {
        System.out.println(firstName + ' ' + lastName + ", возраст " + age + " лет");
    }
}
