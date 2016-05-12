package com.tuyano.libro.bootapp;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class SampleController {
 
    @Autowired
    private MyMongoRepository mongoRepository;
     
    @RequestMapping("/helo")
    public Model helo(Model model) {
        List<MongoData> datas = mongoRepository.findAll();
        model.addAttribute("msg","this is MongoDB sample.");
        model.addAttribute("datas",datas);
        return model;
    }
     
    @RequestMapping(value = "/helo", method = RequestMethod.POST)
    public Model post(Model model, @RequestParam("key") String key) {
        List<MongoData> datas = mongoRepository.findByTitle(key);
        if (datas == null)
            { datas = new ArrayList<MongoData>(); }
        model.addAttribute("msg","this is MongoDB sample.");
        model.addAttribute("datas",datas);
        return model;
    }
}