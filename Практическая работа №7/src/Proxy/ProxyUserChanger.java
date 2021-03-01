package Proxy;

public class ProxyUserChanger implements IUserChanger {
    private UserChanger uc;

    @Override
    public void changeName(User user, String name) {
        System.out.println("Proxy...");
        UserChangerInitializer();
        uc.changeName(user, name);
    }

    @Override
    public void changeAge(User user, int age) {
        System.out.println("Proxy...");
        UserChangerInitializer();
        uc.changeAge(user, age);
    }

    private void UserChangerInitializer() {
        if(uc == null)
            uc = new UserChanger();
    }
}
