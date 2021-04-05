package PR14.Application.controller;

import PR14.Application.model.User;
import PR14.Application.model.UserPostHolder;
import PR14.Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public int insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

    @PostMapping("/posts")
    public int insertPost(@RequestBody UserPostHolder userPostHolder) {
        return userService.insertPost(userPostHolder);
    }

    @DeleteMapping("/users")
    public int deleteUser(@RequestBody User user) {
        return userService.deleteUser(user);
    }

    @DeleteMapping("/posts")
    public int deletePost(@RequestBody UserPostHolder userPostHolder) {
        return userService.deletePost(userPostHolder);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
