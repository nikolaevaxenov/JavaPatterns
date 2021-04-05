package PR16.Application.controller;

import PR16.Application.model.Post;
import PR16.Application.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/post")
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postService.getPosts();
    }

    @GetMapping("/post/{id}")
    public List<Post> getPost(@PathVariable UUID id) {
        return postService.getPost(id);
    }

    @DeleteMapping("/post/{id}")
    public void deletePost(@PathVariable UUID id) {
        postService.deletePost(id);
    }
}
