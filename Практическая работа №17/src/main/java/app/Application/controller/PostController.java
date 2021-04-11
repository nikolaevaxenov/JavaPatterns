package app.Application.controller;

import app.Application.model.Post;
import app.Application.model.User;
import app.Application.service.PostService;
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

    @DeleteMapping("/post/{id}")
    public void deletePost(@PathVariable UUID id) {
        postService.deletePost(id);
    }

    @GetMapping("/getByText")
    public List<Post> getByText() {
        return postService.getByText();
    }

    @GetMapping("/getByCreationDate")
    public List<Post> getByCreationDate() {
        return postService.getByCreationDate();
    }

    @GetMapping(value = "/post/{id}/user")
    public @ResponseBody
    User getUser(@PathVariable("id") UUID id) {
        return postService.getUser(id);
    }
}
