package model.repository.impl;

import model.repository.DefaultRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernateUtils.DataSource;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;


public class DefaultRepositoryImpl<T> implements DefaultRepository<T> {
    @Override
    public void save(T entity) {
        Session session;
        try {
            session= DataSource.getInstance().getSession();
            Transaction transaction= session.beginTransaction();
            session.saveOrUpdate(entity);
            transaction.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }

    }
@Override
    public void delete(T entity) {
        EntityManager entityManager;
        try {
            entityManager=DataSource.getInstance().getEntityManager();
            entityManager.getTransaction().begin();
            entity=entityManager.merge(entity);
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public T findById(Integer id, Class<? extends T> T) {
        Session session=DataSource.getInstance().getSession();
        return session.get(T,id);
    }

}
