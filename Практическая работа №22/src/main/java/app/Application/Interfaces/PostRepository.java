package app.Application.Interfaces;

import app.Application.Classes.Post;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("PostRepository")
public interface PostRepository extends JpaRepository<Post,Long> {
    Post findById(UUID id);

    List<Post> findAll();
    void deleteById(UUID id);
}