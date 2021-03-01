package State;

public class SandwichWithButterAndSausage implements State {
    private static final String name = "бутерброд";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void make(StateInfo stateInfo) {
        System.out.println("Вы уже приготовили бутерброд!");
    }

    @Override
    public void eat(StateInfo stateInfo) {
        stateInfo.setState(new HalfASandwich());
    }
}
