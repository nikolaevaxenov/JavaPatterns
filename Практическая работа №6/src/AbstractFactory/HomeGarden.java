package AbstractFactory;

public class HomeGarden implements GardenFactory {
    public HomeGarden() {
        System.out.println("Создан домашний сад");
    }

    @Override
    public Tree plantTree() {
        System.out.println("Вы не можете посадить дома дерево!");
        return null;
    }

    @Override
    public Flower plantFlower() {
        return new Orchid();
    }
}
