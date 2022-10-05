package model.repository;

import model.entity.Role;

import java.util.List;

public interface RoleRepository extends DefaultRepository<Role> {
    List<Role> findAll();
    Role findById(Integer id);
}
