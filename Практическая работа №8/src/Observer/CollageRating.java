package Observer;

public class CollageRating implements Observer {
    private String name;
    private double gpa;

    public void printInfo() {
        System.out.println("Студент " + name + " имеет средний балл " + gpa);
    }

    @Override
    public void update(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
        printInfo();
    }
}
