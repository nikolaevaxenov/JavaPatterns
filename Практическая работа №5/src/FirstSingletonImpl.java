public class FirstSingletonImpl {
    private static FirstSingletonImpl instance;

    private FirstSingletonImpl() {
        System.out.println("FirstSingletonImpl");
    }

    public static FirstSingletonImpl getInstance() {
        if(instance == null)
            instance = new FirstSingletonImpl();
        return instance;
    }
}
