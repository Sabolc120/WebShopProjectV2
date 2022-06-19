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

    @GetMapping("/gpuPreview")
    public ModelAndView getPreview(@RequestParam Long id){
        ModelAndView mv = new ModelAndView("gpuPreview.html");
        Preview previewGpu = repo.findById(id).orElse(new Preview());
        mv.addObject("previewGpu",previewGpu);
        System.out.println(previewGpu);
        return mv;
    }
}
