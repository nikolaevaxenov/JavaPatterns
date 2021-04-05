package PR14.Application.service;

import PR14.Application.model.Post;
import PR14.Application.model.User;
import PR14.Application.model.UserPostHolder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDataAccessService {
    private static List<User> DB = new ArrayList<>();

    public int insertUser(User user) {
        DB.add(user);
        return 1;
    }

    public int insertPost(UserPostHolder userPostHolder) {
        User user = userPostHolder.getUser();
        String text = userPostHolder.getText();
        for(User i : DB) {
            if(i.getFirstName().equals(user.getFirstName()) && i.getLastName().equals(user.getLastName()) && i.getMiddleName().equals(user.getMiddleName()) && i.getBirthDate().equals(user.getBirthDate())) {
                i.addPost(new Post(text));
            }
        }
        return 1;
    }

    public int deleteUser(User user) {
        DB.removeIf(i -> i.getFirstName().equals(user.getFirstName()) && i.getLastName().equals(user.getLastName()) && i.getMiddleName().equals(user.getMiddleName()) && i.getBirthDate().equals(user.getBirthDate()));
        return 1;
    }

    public int deletePost(UserPostHolder userPostHolder) {
        User user = userPostHolder.getUser();
        String text = userPostHolder.getText();
        for(User i : DB) {
            if(i.getFirstName().equals(user.getFirstName()) && i.getLastName().equals(user.getLastName()) && i.getMiddleName().equals(user.getMiddleName()) && i.getBirthDate().equals(user.getBirthDate())) {
                for(Post j : i.getPosts()) {
                    if(j.getText().equals(text)) {
                        i.deletePost(j);
                    }
                }
            }
        }
        return 1;
    }

    public List<User> getAllUsers() {
        return DB;
    }
}
