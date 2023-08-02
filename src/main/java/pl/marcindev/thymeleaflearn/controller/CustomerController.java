package pl.marcindev.thymeleaflearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.marcindev.thymeleaflearn.model.Customer;

import java.awt.*;

@Controller
public class CustomerController {
    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("customer",new Customer());
        return "customer-form";
    }
}
