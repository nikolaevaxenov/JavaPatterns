package Proxy;

public class UserChanger implements IUserChanger {
    @Override
    public void changeName(User user, String name) {
        user.setName(name);
    }

    @Override
    public void changeAge(User user, int age) {
        user.setAge(age);
    }
}
