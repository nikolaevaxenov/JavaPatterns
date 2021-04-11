package app.Application.Services;

import app.Application.Classes.Post;
import app.Application.Classes.User;
import app.Application.Controllers.PostController;
import app.Application.Controllers.UserController;
import app.Application.Interfaces.PostRepository;
import app.Application.Interfaces.UserRepository;
import app.Application.ScheduleMXBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@Service
public class Schedule implements ScheduleMXBean {
    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final PostRepository postRepository;

    public Schedule(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }

    private Boolean isEmpty(final File file) {
        return (file.isDirectory() && (file.list().length > 0));
    }

    @ManagedOperation
    @Scheduled(cron = "0 0/2 * * * *")
    public void doScheduledTask() throws IOException {
        if(isEmpty(new File("C:\\Users\\frisc\\GoogleDrive\\Study\\JavaPatterns\\Практическая работа №22\\testDirectory"))){
            for (File myFile : new File("C:\\Users\\frisc\\GoogleDrive\\Study\\JavaPatterns\\Практическая работа №22\\testDirectory").listFiles()) {
                if (myFile.isFile()) myFile.delete();
            }
        }

        List <Post> posts = postRepository.findAll();
        List <User> users = userRepository.findAll();

        for (int i = 0; i < users.size(); i++) {
            File user = new File("C:\\Users\\frisc\\GoogleDrive\\Study\\JavaPatterns\\Практическая работа №22\\testDirectory\\user_" + i + ".txt");
            FileWriter writer = new FileWriter(user, true);
            System.out.println(users.get(i).toString());
            writer.write(users.get(i).toString());
            writer.close();
        }

        for (int i = 0; i < posts.size(); i++) {
            File post = new File("C:\\Users\\frisc\\GoogleDrive\\Study\\JavaPatterns\\Практическая работа №22\\testDirectory\\post_" + i + ".txt");
            FileWriter writer = new FileWriter(post, true);
            writer.write(posts.get(i).toString());
            writer.close();
        }
    }
}
