package PR16.Application.controller;

import PR16.Application.model.Post;
import PR16.Application.model.User;
import PR16.Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/userpost/{id}")
    public void addPost(@PathVariable UUID id, @RequestBody String text) {
        userService.addPost(id, new Post(text));
    }

    @DeleteMapping("/userpost/{id}")
    public void deletePost(@PathVariable UUID id, Post post) {
        userService.removePost(id, post);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable UUID id) {
        return userService.getUser(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable UUID id) {
        userService.deleteUser(id);
    }
}
