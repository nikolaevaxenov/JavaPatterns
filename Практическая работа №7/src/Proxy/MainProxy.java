package Proxy;

public class MainProxy {
    public static void main(String[] args) {
        User a = new User("Ivan", 19);
        User b = new User("Petr", 25);
        User c = new User("root", 0);

        UserChanger userChanger = new UserChanger();
        ProxyUserChanger proxyUserChanger = new ProxyUserChanger();

        userChanger.changeAge(a, 21);
        userChanger.changeName(b, "Pavel");
        
        proxyUserChanger.changeName(c, "Ivan&Pavel account");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
