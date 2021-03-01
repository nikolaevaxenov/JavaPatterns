package AbstractFactory;

public class AfricanGarden implements GardenFactory {
    public AfricanGarden() {
        System.out.println("Создан африканский сад!");
    }

    @Override
    public Tree plantTree() {
        return new Baobab();
    }

    @Override
    public Flower plantFlower() {
        return new Gloriosa();
    }
}
