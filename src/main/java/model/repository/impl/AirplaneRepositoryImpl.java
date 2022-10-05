package model.repository.impl;

import hibernateUtils.DataSource;
import model.entity.Airplane;
import model.repository.AirplaneRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class AirplaneRepositoryImpl extends DefaultRepositoryImpl<Airplane> implements AirplaneRepository {
    @Override
    public List<Airplane> findAll() {
        Session session= DataSource.getInstance().getSession();
        Query findAllAirplanes=session.createQuery("from Airplane");
        return findAllAirplanes.getResultList();
    }

    @Override
    public Airplane findByBoardNumber(String boardNumber) {
        Session session=DataSource.getInstance().getSession();
        Query findBoardNumber=session.createQuery("from Airplane where boardNumber=?1");
        findBoardNumber.setParameter(1,boardNumber);
        return (Airplane) findBoardNumber.getSingleResult();
    }
}
