package FactoryMethod;

public class RussianZoo extends Zoo {
    @Override
    protected Animal createAnimal(AnimalType type) {
        return switch (type) {
            case BEAR -> new RussianBear();
            case LION -> new RussianLion();
            case COW -> new RussianCow();
            case OWL -> new RussianOwl();
            case ZEBRA -> null;
        };
    }
}