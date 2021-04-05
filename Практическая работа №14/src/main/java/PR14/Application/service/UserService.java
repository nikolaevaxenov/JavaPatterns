package PR14.Application.service;

import PR14.Application.model.User;
import PR14.Application.model.UserPostHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDataAccessService userDataAccessService;

    @Autowired
    public UserService(UserDataAccessService userDataAccessService) {
        this.userDataAccessService = userDataAccessService;
    }

    public int insertUser(User user) {
        return userDataAccessService.insertUser(user);
    }

    public int insertPost(UserPostHolder userPostHolder) {
        return userDataAccessService.insertPost(userPostHolder);
    }

    public int deleteUser(User user) {
        return userDataAccessService.deleteUser(user);
    }

    public int deletePost(UserPostHolder userPostHolder) {
        return userDataAccessService.deletePost(userPostHolder);
    }

    public List<User> getAllUsers() {
        return userDataAccessService.getAllUsers();
    }
}
