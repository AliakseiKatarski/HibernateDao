package model.repository.impl;


import model.entity.Route;
import model.repository.RouteRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import hibernateUtils.DataSource;

import java.util.List;

public class RouteRepositoryImpl extends DefaultRepositoryImpl<Route> implements RouteRepository {
    @Override
    public List<Route> findAll() {
        Session session= DataSource.getInstance().getSession();
        Query findAllRoutes=session.createQuery("from Route");
        return findAllRoutes.getResultList();
    }

    @Override
    public Route findById(Integer id) {
        Session session=DataSource.getInstance().getSession();
        return session.get(Route.class,id);
    }
}
