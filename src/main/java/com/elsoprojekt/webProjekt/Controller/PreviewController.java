package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Model.Preview;
import com.elsoprojekt.webProjekt.repository.PreviewCpuRepo;
import com.elsoprojekt.webProjekt.repository.PreviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
@Controller
public class PreviewController {

    @Autowired
    public PreviewRepo repo;
    @Autowired
    public PreviewCpuRepo cpurepo;

    @GetMapping("/preview")
    public ModelAndView getPreview(@RequestParam Long id){
        ModelAndView mv = new ModelAndView("preview.html");
        Preview preview1 = repo.findById(id).orElse(new Preview());
        mv.addObject("preview1",preview1);
        System.out.println(preview1);
        return mv;
    }
}
