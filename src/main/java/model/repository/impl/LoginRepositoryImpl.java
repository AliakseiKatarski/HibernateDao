package model.repository.impl;

import hibernateUtils.DataSource;
import model.entity.Login;
import model.repository.LoginRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;



public class LoginRepositoryImpl extends DefaultRepositoryImpl<Login> implements LoginRepository {

    @Override
    public Login findByLogin(String login) {
        Session session=DataSource.getInstance().getSession();
        Query loginQuery=session.createQuery("from Login where login=?1");
        loginQuery.setParameter(1,login);
        return (Login) loginQuery.getSingleResult();
    }

}
