package State;

public class MainState {
    public static void main(String[] args) {
        StateInfo stateInfo = new StateInfo();

        stateInfo.make();
        System.out.println();

        stateInfo.make();
        System.out.println();

        stateInfo.make();
        System.out.println();

        stateInfo.eat();
        System.out.println();

        stateInfo.eat();
    }
}
