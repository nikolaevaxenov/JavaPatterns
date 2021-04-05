package PR14.Application.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Post {
    private final String text;
    private final Date creationDate;

    public Post(@JsonProperty("text") String text) {
        this.text = text;
        this.creationDate = new Date();
    }

    public String getText() {
        return text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "Пост от " + creationDate + "\nТекст: " + text;
    }
}
