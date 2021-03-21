package App.AppMain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {
    @RequestMapping("/test")
    public String open(){
        return "Hello, World!";
    }
}
