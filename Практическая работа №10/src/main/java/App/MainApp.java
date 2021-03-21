package App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("fighters.xml");
        Fighter f = (Fighter) ac.getBean(args[0]);
        f.doFight();
    }
}