import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class HumanBuilder {
    private String[] firstNames = {"James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William", "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles", "Karen", "Christopher", "Nancy", "Daniel", "Lisa", "Matthew", "Margaret", "Anthony", "Betty", "Donald", "Sandra", "Mark", "Ashley", "Paul", "Dorothy", "Steven", "Kimberly", "Andrew", "Emily", "Kenneth", "Donna", "Joshua", "Michelle", "Kevin", "Carol", "Brian", "Amanda"};
    private String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin", "Lee", "Perez", "Thompson", "White", "Harris", "Sanchez", "Clark", "Ramirez", "Lewis", "Robinson"};

    private List<Human> generateList(int size) {
        List<Human> result = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < size; i++) {
            LocalDate ld = LocalDate.of(rand.nextInt(70) + 1950, rand.nextInt(12) + 1, rand.nextInt(27) + 1);
            result.add(new Human(rand.nextInt(99), firstNames[rand.nextInt(firstNames.length)], lastNames[rand.nextInt(lastNames.length)], ld, rand.nextInt(100) + 20));
        }

        return result;
    }

    public void humanTask(int size) {
        List<Human> harr = generateList(size);

        System.out.println("Original list:");
        harr.forEach(System.out::println);

        System.out.println("\nList after applying stream methods:");
        Stream<Human> s1 = harr.stream();
        Stream<Human> s2 = harr.stream();
        Stream<Human> s3 = harr.stream();

        System.out.println("\nFirst stream: ");
        s1.peek(o -> o.setWeight(o.getWeight() - 5)).forEach(System.out::println);

        System.out.println("\nSecond stream: ");
        s2.filter(o -> o.getBirthDate().isBefore(LocalDate.of(1999, 2, 3))).forEach(System.out::println);

        System.out.println("\nThird stream: ");
        s3.map(o -> o.getLastName() + ' ').forEach(System.out::print);
    }
}
