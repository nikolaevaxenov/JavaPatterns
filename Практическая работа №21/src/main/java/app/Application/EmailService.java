package app.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;

public class EmailService {
    @Autowired
    public JavaMailSender emailSender;

    @Async
    public void SendEmail(){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("lorememail@bk.ru");
        message.setTo("ghost777t@ya.ru");
        message.setSubject("Test email message");
        message.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla feugiat eget sapien sed lacinia.");

        this.emailSender.send(message);
        System.out.println("Email successfully sent!");
    }
}
