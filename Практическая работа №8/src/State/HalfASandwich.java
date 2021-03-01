package State;

public class HalfASandwich implements State {
    private static final String name = "половина бутерброда";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void make(StateInfo stateInfo) {
        System.out.println("Вы уже начали есть бутерброд!");
    }

    @Override
    public void eat(StateInfo stateInfo) {
        System.out.println("Вы съели бутерброд");
    }
}
