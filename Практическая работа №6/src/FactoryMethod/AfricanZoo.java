package FactoryMethod;

public class AfricanZoo extends Zoo {
    @Override
    protected Animal createAnimal(AnimalType type) {
        Animal animal = null;

        switch (type) {
            case ZEBRA:
                animal = new AfricanZebra();
                break;
            case LION:
                animal = new AfricanLion();
                break;
            case COW:
                animal = new AfricanCow();
                break;
            case OWL:
                animal = new AfricanOwl();
                break;
            case BEAR:
                animal = new RussianBear();
                break;
        }
        return animal;
    }
}
