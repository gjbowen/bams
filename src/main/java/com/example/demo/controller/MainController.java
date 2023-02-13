package com.example.demo.controller;

import com.example.demo.entity.Fields;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/tester")
    public String greetingForm(Model model) {
        model.addAttribute("fields", new Fields());
        System.err.println("alpha");
        return "tester";
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("fields", new Fields());
        return "tester";
    }

    @PostMapping("/tester")
    public String greetingSubmit(@ModelAttribute Fields fields, Model model) {
        model.addAttribute("fields", fields);
        System.out.println(fields.toString());
        // init service
        if(fields.getPgmCode()==10460){
            model.addAttribute("result","RSVP");
        } else if (fields.getPgmCode() == 10463) {
            model.addAttribute("result","SPECIAL");
        }
        else{
            model.addAttribute("result","Unknown!!");
        }
        return "tester";
    }

}
