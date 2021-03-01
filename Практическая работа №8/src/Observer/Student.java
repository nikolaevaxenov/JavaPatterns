package Observer;

import java.util.LinkedList;
import java.util.List;

public class Student implements Observable {
    private String name;
    private double gpa;
    private List<Observer> obs;

    public Student() {
        obs = new LinkedList<>();
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
        notifyObservers();
    }

    public void setNameAndGPA(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        obs.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        obs.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: obs)
            o.update(name, gpa);
    }


}
