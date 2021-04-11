package app.Application.Controllers;

import app.Application.Classes.Post;
import app.Application.Classes.User;
import app.Application.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/posts")
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }

    @GetMapping("/posts")
    public List<Post> getAll() {
        return postService.getPosts();
    }

    @DeleteMapping("/post/{id}")
    public void delete(@PathVariable UUID id) {
        postService.deletePost(id);
    }

    @GetMapping(value = "/post/{id}/user")
    public @ResponseBody
    User getGame(@PathVariable("id") UUID id) {
        return postService.getUserByPost(id);
    }
}
