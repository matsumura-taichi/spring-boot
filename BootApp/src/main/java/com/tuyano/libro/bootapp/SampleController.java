package com.tuyano.libro.bootapp;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class SampleController {
 
    @RequestMapping("/helo")
    public String helo(Model model) {
        model.addAttribute("val", "text in Controller");
    return "helo";
    }
 
}