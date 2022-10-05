package model.repository.impl;

import hibernateUtils.DataSource;
import model.entity.Passport;
import model.repository.PassportRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class PassportRepositoryImpl extends DefaultRepositoryImpl<Passport> implements PassportRepository {

    @Override
    public Passport findByPassportNumber(String passNum) {
        Session session=DataSource.getInstance().getSession();
        Query findPassNum=session.createQuery("from Passport where passNumber =?1");
        findPassNum.setParameter(1,passNum);
        return (Passport) findPassNum.getSingleResult();
    }

    @Override
    public List<Passport> findInvalidPassports() {
        LocalDateTime nowDateTime= LocalDateTime.now();
        Session session=DataSource.getInstance().getSession();
        return null;
    }
}
