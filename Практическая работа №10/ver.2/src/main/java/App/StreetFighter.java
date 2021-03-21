package App;

import org.springframework.stereotype.Component;

@Component
public class StreetFighter implements Fighter {
    @Override
    public void doFight() {
        System.out.println("Street fighter enters the ring");
    }
}