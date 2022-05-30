package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Controller.Service.UserService;
import com.elsoprojekt.webProjekt.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class registerController {
    private final UserService userService;

    public registerController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/register")
    public ModelAndView registerGet(User user) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/register");
        return mav;
    }
    @PostMapping("/register")
    public ModelAndView registerPost(@RequestParam("username") String username, @RequestParam("password") String password) {
        // If verifications okay, add the user to database.
        User user = userService.addUser(new User(password, username));
        return new ModelAndView("redirect:/");
    }
}
