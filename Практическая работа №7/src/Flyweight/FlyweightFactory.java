package Flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<Integer, Human> people = new HashMap<>();

    public Human getHumanInfo(int number) {
        Human human = people.get(number);
        if (human == null) {
            switch (number) {
                case 1: {
                    human = new FirstHuman();
                    break;
                }
                case 2: {
                    human = new SecondHuman();
                    break;
                }
                case 3: {
                    human = new ThirdHuman();
                    break;
                }
            }
            people.put(number, human);
        }
        return human;
    }
}
