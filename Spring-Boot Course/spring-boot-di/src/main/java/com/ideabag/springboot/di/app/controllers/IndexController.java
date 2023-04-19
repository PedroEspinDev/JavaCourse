package com.ideabag.springboot.di.app.controllers;

import com.ideabag.springboot.di.app.models.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.processing.Generated;

@Controller
public class IndexController {
    @Autowired
    private IService service;

    @GetMapping({"/", "", "/index"})
    public String index(Model model) {

        model.addAttribute("objeto", service.operacion());
        return "index";
    }
}
