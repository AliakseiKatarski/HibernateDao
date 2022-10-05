package model.repository;

import model.entity.User;

import java.util.List;

public interface UserRepository extends DefaultRepository<User>{
    List<User> findAll();

}
