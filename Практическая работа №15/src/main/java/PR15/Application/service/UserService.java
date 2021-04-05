package PR15.Application.service;

import PR15.Application.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private final SessionFactory sessionFactory;

    private Session session;

    public UserService(SessionFactory sessionFactory) {
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

    public void addUser(User user) {
        session.beginTransaction();
        session.saveOrUpdate(user);
        session.getTransaction().commit();
    }

    public List<User> getUsers() {
        return session.createQuery("select u from User u", User.class).list();
    }

    public User getUser(UUID id) {
        return session.createQuery("select p from User u where u.id = p.id = '" + id + "'", User.class).getSingleResult();
    }

    public void deleteUser(UUID id) {
        session.beginTransaction();

        User t = session.load(User.class, id);
        session.delete(t);

        session.getTransaction().commit();
    }
}
