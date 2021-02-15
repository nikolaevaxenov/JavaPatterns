import java.util.Comparator;
import java.util.Scanner;

public class startStudent {
    public static void main(String[] args)  {
        System.out.print("Введите два балла GPA для двух студентов через пробел: ");
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        Student a = new Student(Double.parseDouble(arr[0]));
        Student b = new Student(Double.parseDouble(arr[1]));

        Comparator<Student> compGPA = (o1, o2) -> Double.compare(o1.getGPA(), o2.getGPA());
        double result = compGPA.compare(a, b);

        if(result >= 1)
            System.out.println("У первого студента GPA больше чем у второго.");
        else if(result == 0)
            System.out.println("Оба студента имеют одиннаковые баллы.");
        else
            System.out.println("У второго студента GPA больше чем у первого");
    }
}
