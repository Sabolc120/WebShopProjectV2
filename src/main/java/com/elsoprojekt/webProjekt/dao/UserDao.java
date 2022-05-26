package com.elsoprojekt.webProjekt.dao;

import com.elsoprojekt.webProjekt.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Long>{
    @Query("FROM User WHERE username = :username AND password = :password")
    User findUserByCredentials(@Param(value = "username") String username, @Param(value = "password") String password);
}
