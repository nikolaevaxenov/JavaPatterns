package app.Application.Interfaces;

import app.Application.Classes.User;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllByFirstName(String firstName);
    List<User> findAllByLastName(String lastName);

    @NotNull List<User> findAll();
    void deleteById(UUID id);
}
