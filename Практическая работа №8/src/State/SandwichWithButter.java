package State;

public class SandwichWithButter implements State {
    private static final String name = "хлеб с маслом";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void make(StateInfo stateInfo) {
        stateInfo.setState(new SandwichWithButterAndSausage());
    }

    @Override
    public void eat(StateInfo stateInfo) {
        System.out.println("Сначала нужно приготовить бутерброд! Пока он на стадии: " + name);
    }
}
