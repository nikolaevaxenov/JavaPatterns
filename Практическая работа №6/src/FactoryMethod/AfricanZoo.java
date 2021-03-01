package FactoryMethod;

public class AfricanZoo extends Zoo {
    @Override
    protected Animal createAnimal(AnimalType type) {
        return switch (type) {
            case ZEBRA -> new AfricanZebra();
            case LION -> new AfricanLion();
            case COW -> new AfricanCow();
            case OWL -> new AfricanOwl();
            case BEAR -> null;
        };
    }
}
