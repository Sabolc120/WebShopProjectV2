package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Model.PreviewTopOffers;
import com.elsoprojekt.webProjekt.repository.PreviewTopOffersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PreviewComputers {
    @Autowired
    public PreviewTopOffersRepo repo;

    @GetMapping("/computersPreview")
    public ModelAndView getComputers(@RequestParam Long id){
        ModelAndView mv = new ModelAndView("computersPreview.html");
        PreviewTopOffers computers = repo.findById(id).orElse(new PreviewTopOffers());
        mv.addObject("computersPreview",computers);
        System.out.println(computers);
        return mv;
    }

}
