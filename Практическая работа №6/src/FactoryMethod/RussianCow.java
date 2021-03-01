package FactoryMethod;

public class RussianCow extends Cow {
    @Override
    public String getType() {
        return "Cow from Russia";
    }
}
