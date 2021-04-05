package PR16.Application.service;

import PR16.Application.model.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.UUID;

@Service
public class PostService {
    @Autowired
    private final SessionFactory sessionFactory;

    private Session session;

    public PostService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @PostConstruct
    public void init() {
        session = sessionFactory.openSession();
    }

    @PreDestroy
    public void unSession() {
        session.close();
    }

    public void addPost(Post post) {
        session.beginTransaction();
        session.saveOrUpdate(post);
        session.getTransaction().commit();
    }

    public List<Post> getPosts() {
        return session.createQuery("select p from Post p", Post.class).list();
    }

    public List<Post> getPost(UUID id) {
        return session.createQuery("select p from Post p where p.id ='" + id + "'", Post.class).list();
    }

    public void deletePosts(Post post) {
        session.beginTransaction();

        List<Post> query = session.createQuery("select p from Post p where p.id = '" + post.getId() + "'", Post.class).list();
        for (Post p : query) {
            session.delete(p);
        }

        session.getTransaction().commit();
    }

    public void deletePost(UUID id) {
        session.beginTransaction();

        Post t = session.load(Post.class, id);
        session.delete(t);

        session.getTransaction().commit();
    }
}
