package model.repository;

import model.entity.Ticket;

import java.util.List;

public interface TicketRepository extends DefaultRepository<Ticket>{
    List<Ticket> findAll();
    Ticket findById(Integer id);
}
