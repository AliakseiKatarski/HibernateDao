package model.repository;


import model.entity.Passport;


import java.util.List;

public interface PassportRepository extends DefaultRepository<Passport> {
    Passport findByPassportNumber(String passNum);
    List<Passport> findInvalidPassports();

}
