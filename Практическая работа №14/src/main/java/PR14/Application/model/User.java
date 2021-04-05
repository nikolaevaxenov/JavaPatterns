package PR14.Application.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String birthDate;

    private final List<Post> posts = new ArrayList<>();

    public User(@JsonProperty("firstName") String firstName,
                @JsonProperty("lastName") String lastName,
                @JsonProperty("middleName") String middleName,
                @JsonProperty("birthDate") String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public void deletePost(Post post) {
        this.posts.remove(post);
    }

    @Override
    public String toString() {
        return "Пользователь " + lastName + " " + firstName + " " + middleName + ", день рождения: " + birthDate + "\nОпубликовал следующие посты: " + posts;
    }
}
