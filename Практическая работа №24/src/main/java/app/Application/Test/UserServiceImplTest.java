package app.Application.Test;

import app.Application.Classes.User;
import app.Application.Interfaces.UserRepository;
import app.Application.Services.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
    @Mock
    private UserRepository userRepository;

    @Test
    public void getGame() {
        userRepository=mock(UserRepository.class);

        User user = new User();
        user.setUsername("Ivan");

        User user1 = new User();
        user1.setUsername("Petr");

        Mockito.when(userRepository.findAll()).thenReturn(List.of(user,user1));
        UserService userService = new UserService(userRepository);
        Assertions.assertEquals(2, userService.allUsers().size());
        Assertions.assertEquals("Petr",
                userService.allUsers().get(0).getUsername());
    }
}
