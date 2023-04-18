package com.anushkrish.cms.dao;

import com.anushkrish.cms.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User,String> {
    User findByUsername(String username);
}
