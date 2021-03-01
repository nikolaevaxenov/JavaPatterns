package FactoryMethod;

public class RussianZoo extends Zoo {
    @Override
    protected Animal createAnimal(AnimalType type) {
        Animal animal = null;

        switch (type) {
            case BEAR:
                animal = new RussianBear();
                break;
            case COW:
                animal = new RussianCow();
                break;
            case OWL:
                animal = new RussianOwl();
                break;
            case LION:
                animal = new RussianLion();
                break;
            case ZEBRA:
                animal = new AfricanZebra();
                break;
        }
        return animal;
    }
}