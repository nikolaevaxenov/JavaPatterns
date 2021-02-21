public class ThirdSingletonImpl {
    private ThirdSingletonImpl() {
        System.out.println("ThirdSingletonImpl");
    }

    private static class ThirdSingletonImplHolder {
        private final static ThirdSingletonImpl instance = new ThirdSingletonImpl();
    }

    public static ThirdSingletonImpl getInstance() {
        return ThirdSingletonImplHolder.instance;
    }
}
