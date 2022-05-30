package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Model.PreviewCpu;
import com.elsoprojekt.webProjekt.repository.PreviewCpuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PreviewCpuController {
    @Autowired
    public PreviewCpuRepo repo;

    @GetMapping("/previewCpu")
    public ModelAndView getPreviewCpu(@RequestParam Long id){
        ModelAndView mv = new ModelAndView("preview.html");
        PreviewCpu preview1 = repo.findById(id).orElse(new PreviewCpu());
        mv.addObject("preview1",preview1);
        System.out.println(preview1);
        return mv;
    }

}
