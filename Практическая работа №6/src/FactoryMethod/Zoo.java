package FactoryMethod;

public abstract class Zoo {
    public void buyNewAnimal(AnimalType type) {
        Animal animal = createAnimal(type);
        System.out.println("You just bought " + animal.getType() + " at the zoo!");
    }

    protected abstract Animal createAnimal(AnimalType type);
}
