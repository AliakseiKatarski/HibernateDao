package model.repository;

import model.entity.Airplane;

import java.util.List;

public interface AirplaneRepository extends DefaultRepository<Airplane>{
    Airplane findByBoardNumber(String boardNumber);
}
