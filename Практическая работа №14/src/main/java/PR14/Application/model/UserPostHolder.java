package PR14.Application.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPostHolder {
    private final User user;
    private final String text;

    public UserPostHolder(@JsonProperty("user") User user,
                          @JsonProperty("text") String text) {
        this.user = user;
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public String getText() {
        return text;
    }
}
