package AbstractFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        AfricanGarden ag = new AfricanGarden();
        ag.plantFlower();
        ag.plantTree();

        System.out.print("\n");
        EuropeanGarden eg = new EuropeanGarden();
        eg.plantFlower();
        eg.plantTree();

        System.out.print("\n");
        HomeGarden hg = new HomeGarden();
        hg.plantFlower();
        hg.plantTree();
    }
}
