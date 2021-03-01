package AbstractFactory;

public class EuropeanGarden implements GardenFactory {
    public EuropeanGarden() {
        System.out.println("Создан европейский сад!");
    }

    @Override
    public Tree plantTree() {
        return new Oak();
    }

    @Override
    public Flower plantFlower() {
        return new Rose();
    }
}
