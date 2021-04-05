package PR14.Application.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping(value = "/home", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String homePage() {
        return "<html>\n" +
                "<head><title>Home</title></head>\n" +
                "<body>\n" +
                "Фамилия: Николаев-Аксенов<br><hr>\nИмя: Иван<br><hr>\nНомер группы: ИКБО-20-19<br><hr>\nНомер варианта: 21(6)<hr>" +
                "</body>\n" +
                "</html>";
    }
}