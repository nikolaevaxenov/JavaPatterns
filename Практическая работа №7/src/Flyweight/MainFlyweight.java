package Flyweight;

public class MainFlyweight {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        int[] peopleList = {1, 2, 3, 3, 2};
        for(int i: peopleList) {
            Human h = factory.getHumanInfo(i);
            h.getInfo();
        }
    }
}
