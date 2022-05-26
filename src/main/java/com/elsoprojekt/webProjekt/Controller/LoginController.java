package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Controller.Service.UserService;
import com.elsoprojekt.webProjekt.Model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController{
    private final UserService userService;
    private final HttpSession httpSession;

    public LoginController(UserService userService, HttpSession httpSession) {
        this.userService = userService;
        this.httpSession = httpSession;
    }
    @PostMapping("/login")
    public ModelAndView loginPost(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = userService.getUser(password, username);
        httpSession.setAttribute("user", user);
        if(userService.getUser(username, password) == null){
            return new ModelAndView("redirect:/error");
        }
        else
        return new ModelAndView("redirect:/");
    }
}
