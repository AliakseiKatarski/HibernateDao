package model.repository.impl;

import model.entity.Ticket;
import model.repository.TicketRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import hibernateUtils.DataSource;

import java.util.List;

public class TicketRepositoryImpl extends DefaultRepositoryImpl<Ticket> implements TicketRepository {

    @Override
    public List<Ticket> findAll() {
        Session session = DataSource.getInstance().getSession();
            Query findAllTickets = session.createQuery("from Ticket");
        return findAllTickets.getResultList();
        }
}
