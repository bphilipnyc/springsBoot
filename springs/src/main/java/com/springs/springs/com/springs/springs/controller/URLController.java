package com.springs.springs.com.springs.springs.controller;

import com.springs.springs.hibernate.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class URLController {

    @GetMapping({"/", "/index"})
    public String index(Model model) {

        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping("/result")
    public String result(@ModelAttribute Employee employee) {

        System.out.println("******");
        System.out.println(employee.getName());
        System.out.println("******");
        return "result";
    }
}
