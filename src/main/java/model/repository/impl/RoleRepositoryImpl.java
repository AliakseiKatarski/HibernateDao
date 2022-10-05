package model.repository.impl;

import model.entity.Role;
import model.repository.RoleRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import hibernateUtils.DataSource;

import java.util.List;

public class RoleRepositoryImpl extends DefaultRepositoryImpl<Role> implements RoleRepository {
    @Override
    public List<Role> findAll() {
        Session session= DataSource.getInstance().getSession();
        Query findAllRoles=session.createQuery("from Role");
        return findAllRoles.getResultList();
    }

    @Override
    public Role findById(Integer id) {
        Session session=DataSource.getInstance().getSession();
        return session.get(Role.class,id);
    }
}
