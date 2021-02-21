public class FourthSingletonImpl {
    private static volatile FourthSingletonImpl instance;

    private FourthSingletonImpl() {
        System.out.println("FourthSingletonImpl");
    }

    public static FourthSingletonImpl getInstance() {
        if (instance == null)
            synchronized (FourthSingletonImpl.class) {
            if (instance == null)
                instance = new FourthSingletonImpl();
            }
        return instance;
    }
}
