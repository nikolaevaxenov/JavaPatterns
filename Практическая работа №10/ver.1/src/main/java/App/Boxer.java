package App;

import org.springframework.stereotype.Component;

@Component
public class Boxer implements Fighter {
    @Override
    public void doFight() {
        System.out.println("Boxer enters the ring");
    }
}