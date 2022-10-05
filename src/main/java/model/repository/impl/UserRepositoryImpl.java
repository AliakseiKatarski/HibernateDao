package model.repository.impl;
import model.entity.User;
import model.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import hibernateUtils.DataSource;


import java.util.List;

public class UserRepositoryImpl extends DefaultRepositoryImpl<User> implements UserRepository {

    @Override
    public List<User> findAll() {
        Session session=DataSource.getInstance().getSession();
        Query findAllUsers=session.createQuery("from User");
        return findAllUsers.getResultList();
    }

    @Override
    public User findById(Integer id) {
        Session session=DataSource.getInstance().getSession();
        return session.get(User.class,id);
    }

}
