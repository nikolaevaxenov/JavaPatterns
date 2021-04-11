package app.Application.Controllers;

import app.Application.Classes.User;
import app.Application.Services.UserService;
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
    public List<User> getAll() {
        return userService.getUsers();
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable UUID id) {
        userService.deleteUser(id);
    }

    @GetMapping("/getUserByFirstName/{firstName}")
    public List<User> getByFirstName(@PathVariable String firstName){
        return userService.getByFirstName(firstName);
    }

    @GetMapping("/getUserByLastName/{lastName}")
    public List<User> getByLastName(@PathVariable String lastName){
        return userService.getByLastName(lastName);
    }
}
