package com.elsoprojekt.webProjekt.Controller.Service;

import com.elsoprojekt.webProjekt.Model.User;

public interface UserService {
    User addUser(User user);
    User getUser(String username, String password);
}
