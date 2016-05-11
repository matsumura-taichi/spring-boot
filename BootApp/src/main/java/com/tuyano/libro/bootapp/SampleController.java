package com.tuyano.libro.bootapp;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class SampleController {
 
    @RequestMapping("/helo")
    public Model helo(Model model) {
        Data data = new Data("Taro","taro@yamada","090-999-999");
        model.addAttribute("data",data);
        model.addAttribute("msg","It's a sample!");
        return model;
    }
}
 
class Data {
    private String name;
    private String mail;
    private String tel;
     
    public Data(String name, String mail, String tel){
        this.name = name;
        this.mail = mail;
        this.tel = tel;
    }
 
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getMail() { return mail; }
     
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
}