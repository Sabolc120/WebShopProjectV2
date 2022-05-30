package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Model.PreviewTopOffers;
import com.elsoprojekt.webProjekt.repository.PreviewTopOffersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PreviewTopOffersController {
    @Autowired
    public PreviewTopOffersRepo repo;

    @GetMapping("/previewTopOffers")
    public ModelAndView getPreviewTopOffers(@RequestParam Long id){
        ModelAndView mv = new ModelAndView("preview.html");
        PreviewTopOffers preview1 = repo.findById(id).orElse(new PreviewTopOffers());
        mv.addObject("preview1",preview1);
        System.out.println(preview1);
        return mv;
    }

}
