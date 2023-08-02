package pl.marcindev.thymeleaflearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
public class AppController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
       model.addAttribute("theDate",new Date());
       return "helloworld";
    }
}

