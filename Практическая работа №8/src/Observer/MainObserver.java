package Observer;

public class MainObserver {
    public static void main(String[] args) {
        Student student = new Student();
        Observer studentInfo = new CollageRating();

        student.addObserver(studentInfo);

        student.setNameAndGPA("Ivan", 7.9);
        student.setName("Petr");
        student.setGpa(5.2);
    }
}
