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

}
