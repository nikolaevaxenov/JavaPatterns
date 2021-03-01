package State;

public class StateInfo {
    private State state = new Bread();

    public void make() {
        System.out.println("Готовим бутерброд, текущее состояние " + state.getName());
        state.make(this);
    }

    public void eat() {
        System.out.println("Едим бутерброд, текущее состояние " + state.getName());
        state.eat(this);
    }

    public void setState(State state) {
        System.out.println("Изменяем состояние бутерброда на " + state.getName());
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
