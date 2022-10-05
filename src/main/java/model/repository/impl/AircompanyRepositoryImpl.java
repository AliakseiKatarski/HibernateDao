package model.repository.impl;

import hibernateUtils.DataSource;
import model.entity.Aircompany;
import model.repository.AircompanyRepository;
import model.repository.DefaultRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class AircompanyRepositoryImpl extends DefaultRepositoryImpl<Aircompany> implements AircompanyRepository {
    @Override
    public List<Aircompany> findAll() {
        Session session= DataSource.getInstance().getSession();
        Query findAllCompaniesQuery=session.createQuery("from Aircompany");
        return findAllCompaniesQuery.getResultList();
    }

    @Override
    public Aircompany findByName(String name) {
        Session session=DataSource.getInstance().getSession();
        Query findByCompanyByName=session.createQuery("from Aircompany where companyName=?1");
        findByCompanyByName.setParameter(1,name);
        return (Aircompany) findByCompanyByName.getSingleResult();
    }
}
