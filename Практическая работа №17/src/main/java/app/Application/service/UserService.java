package app.Application.service;

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
public class UserService {
    @Autowired
    private final SessionFactory sessionFactory;

    private Session session;
    private CriteriaBuilder builder;
    private CriteriaQuery<User> userCriteriaQuery;
    private Root<User> root;

    public UserService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @PostConstruct
    public void init() {
        session = sessionFactory.openSession();
        builder = session.getCriteriaBuilder();
        userCriteriaQuery = builder.createQuery(User.class);
        root = userCriteriaQuery.from(User.class);
    }

    @PreDestroy
    public void unSession() {
        session.close();
    }

    public void addUser(User user) {
        session.beginTransaction();
        session.saveOrUpdate(user);
        session.getTransaction().commit();
    }

    public List<User> getUsers() {
        return session.createQuery("select u from User u", User.class).list();
    }

    public User getUser(UUID id) {
        return session.createQuery("select u from User u where u.id = p.id = '" + id + "'", User.class).getSingleResult();
    }

    public void deleteUser(UUID id) {
        session.beginTransaction();

        User t = session.load(User.class, id);
        session.delete(t);

        session.getTransaction().commit();
    }

    public List<User> getByFirstName() {
        userCriteriaQuery.select(root).orderBy(builder.asc(root.get("firstName")));
        Query<User> query = session.createQuery(userCriteriaQuery);
        return query.getResultList();
    }

    public List<User> getByLastName() {
        userCriteriaQuery.select(root).orderBy(builder.asc(root.get("lastName")));
        Query<User> query = session.createQuery(userCriteriaQuery);
        return query.getResultList();
    }
}
