package model.repository;

import model.entity.Login;

import java.util.List;


public interface LoginRepository extends DefaultRepository<Login> {
    Login findByLogin(String login);
    List<Login> findAll();

}
