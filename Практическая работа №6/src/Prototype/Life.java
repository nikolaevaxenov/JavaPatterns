package Prototype;

public class Life {
    private Type type;

    public Life() {
    }

    public Life(Type type) {
        this.type = type;
    }

    public Life copy() {
        return new Life();
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Life{" +
                "type=" + type +
                '}';
    }
}
