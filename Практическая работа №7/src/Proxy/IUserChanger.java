package Proxy;

import Flyweight.Human;

public interface IUserChanger {
    void changeName(User user, String name);
    void changeAge(User user, int age);
}
