package Builder;

public class Animal {
    private final String species;
    private final int weight;
    private final String habitat;
    private final int lifespan;

    public static class AnimalBuilder {
        private final String species;
        private int weight = 0;
        private String habitat = "";
        private int lifespan = 0;

        public AnimalBuilder(String species) {
            this.species = species;
        }

        public AnimalBuilder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public AnimalBuilder habitat(String habitat) {
            this.habitat = habitat;
            return this;
        }

        public AnimalBuilder lifespan(int lifespan) {
            this.lifespan = lifespan;
            return this;
        }

        public Animal create() {
            return new Animal(this);
        }
    }

    private Animal(AnimalBuilder builder) {
        species = builder.species;
        weight = builder.weight;
        habitat = builder.habitat;
        lifespan = builder.lifespan;
    }

    @Override
    public String toString() {
        return species + " обычно живет в " + habitat
                + ", весит примерно " + weight
                + " и живет " + lifespan + " лет.";
    }
}
