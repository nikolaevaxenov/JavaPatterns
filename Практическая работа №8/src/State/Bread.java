package State;

public class Bread implements State {
    private static final String name = "хлеб";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void make(StateInfo stateInfo) {
        stateInfo.setState(new SandwichWithButter());
    }

    @Override
    public void eat(StateInfo stateInfo) {
        System.out.println("Сначала нужно приготовить бутерброд! Пока он на стадии: " + name);
    }
}
