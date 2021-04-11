package app.Application.service;

import app.Application.model.Post;
import app.Application.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.UUID;

@Service
public class PostService {
    @Autowired
    private final SessionFactory sessionFactory;

    private Session session;
    private CriteriaBuilder builder;
    private CriteriaQuery<Post> criteriaQuery;
    private Root<Post> root;

    public PostService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @PostConstruct
    public void init() {
        session = sessionFactory.openSession();
        builder = session.getCriteriaBuilder();
        criteriaQuery = builder.createQuery(Post.class);
        root = criteriaQuery.from(Post.class);
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

    public User getUser(UUID id) {
        return session.createQuery("from Post where id = :id", Post.class).setParameter("id",id).getSingleResult().getUser();
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

    public List<Post> getByText() {
        criteriaQuery.select(root).orderBy(builder.asc(root.get("text")));
        Query<Post> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }

    public List<Post> getByCreationDate() {
        criteriaQuery.select(root).orderBy(builder.asc(root.get("creationDate")));
        Query<Post> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
