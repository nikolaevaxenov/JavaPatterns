package Flyweight;

public class FirstHuman extends Human {
    public FirstHuman() {
        firstName = "Иван";
        lastName = "Николаев-Аксенов";
        age = 19;
    }

    @Override
    public void getInfo() {
        System.out.println(firstName + ' ' + lastName + ", возраст " + age + " лет");
    }
}
