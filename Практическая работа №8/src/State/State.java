package State;

public interface State {
    String getName();
    void make(StateInfo stateInfo);
    void eat(StateInfo stateInfo);
}
