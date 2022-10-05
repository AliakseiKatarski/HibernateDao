package model.repository;

import model.entity.Aircompany;

import java.util.List;


public interface AircompanyRepository extends DefaultRepository<Aircompany>{
    Aircompany findByName(String name);
}
