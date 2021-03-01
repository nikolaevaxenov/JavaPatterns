package Prototype;

public class MainPrototype {
    public static void main(String[] args) {
        Life bacteria = new Life(Type.BACTERIA);
        Life fungus = bacteria.copy();
        fungus.setType(Type.FUNGUS);

        System.out.println(bacteria);
        System.out.println(fungus);
    }
}
