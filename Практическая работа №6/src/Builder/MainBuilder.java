package Builder;

public class MainBuilder {
    public static void main(String[] args) {
        Animal lion = new Animal
                .AnimalBuilder("Лев")
                .weight(150)
                .habitat("Саванна")
                .lifespan(12)
                .create();

        Animal polarBear = new Animal
                .AnimalBuilder("Белый медведь")
                .weight(400)
                .habitat("Арктика")
                .lifespan(25)
                .create();

        Animal redFox = new Animal
                .AnimalBuilder("Обыкновенная лисица")
                .weight(10)
                .habitat("тундра, и степи, и леса разного типа, и пустыни и высокогорья")
                .lifespan(4)
                .create();

        System.out.println(lion);
        System.out.println(polarBear);
        System.out.println(redFox);
    }
}
