package com.role.jwt.dao;

import com.role.jwt.entity.Role;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
