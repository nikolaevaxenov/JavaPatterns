package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zoo in Cape Town, Republic of South Africa");
        Zoo capeTown = new AfricanZoo();
        capeTown.buyNewAnimal(AnimalType.ZEBRA);
        capeTown.buyNewAnimal(AnimalType.OWL);
        capeTown.buyNewAnimal(AnimalType.COW);
        capeTown.buyNewAnimal(AnimalType.LION);

        System.out.println("\nZoo in Moscow, Russian Federation");
        Zoo moscow = new RussianZoo();
        moscow.buyNewAnimal(AnimalType.BEAR);
        moscow.buyNewAnimal(AnimalType.OWL);
        moscow.buyNewAnimal(AnimalType.COW);
        moscow.buyNewAnimal(AnimalType.LION);
    }
}
