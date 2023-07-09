package com.role.jwt.dao;

import com.role.jwt.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UserDao extends CrudRepository<User,String> {

}
