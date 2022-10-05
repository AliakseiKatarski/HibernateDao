package model.repository;


import model.entity.Passport;

import java.sql.Timestamp;
import java.util.List;

public interface PassportRepository extends DefaultRepository<Passport> {
    Passport findById(Integer id);
    Passport findByPassportNumber(String passNum);
    List<Passport> findInvalidPassports();

}
