public class SecondSingletonImpl {
    private static SecondSingletonImpl instance = new SecondSingletonImpl();

    private SecondSingletonImpl() {
        System.out.println("SecondSingletonImpl");
    }

    public static SecondSingletonImpl getInstance() {
        return instance;
    }
}
