package com.elsoprojekt.webProjekt.repository;

import com.elsoprojekt.webProjekt.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

}
