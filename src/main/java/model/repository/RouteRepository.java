package model.repository;

import model.entity.Route;
import java.util.List;

public interface RouteRepository extends DefaultRepository<Route>{
    List<Route> findAll();
    Route findById(Integer id);
}
