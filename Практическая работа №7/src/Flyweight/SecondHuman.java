package Flyweight;

public class SecondHuman extends Human {
    public SecondHuman() {
        firstName = "Иван";
        lastName = "Иванов";
        age = 23;
    }

    @Override
    public void getInfo() {
        System.out.println(firstName + ' ' + lastName + ", возраст " + age + " лет");
    }
}
