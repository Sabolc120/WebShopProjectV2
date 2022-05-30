package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Model.BasketModel;
import com.elsoprojekt.webProjekt.repository.basketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasketController {
    @Autowired
    public basketRepo repo;

    @GetMapping("/basket")
    public ModelAndView getPreviewBasket(@RequestParam Long id){
        ModelAndView mv = new ModelAndView("preview.html");
        BasketModel preview1 = repo.findById(id).orElse(new BasketModel());
        mv.addObject("preview1",preview1);
        System.out.println(preview1);
        return mv;
    }
}
