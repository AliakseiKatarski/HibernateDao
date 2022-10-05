package model.repository;

import model.entity.Airplane;

import java.util.List;

public interface AirplaneRepository extends DefaultRepository<Airplane>{
    List<Airplane> findAll();
    Airplane findById(Integer id);
    Airplane findByBoardNumber(String boardNumber);
}
