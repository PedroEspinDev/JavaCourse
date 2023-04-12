package com.ideabag.springboot.web.app.controllers;

import com.ideabag.springboot.web.app.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/index", "/", "/home"})
    public String index(Model model) {
        model.addAttribute("titulo", "hola Spring Framework cn Model!");
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model) {
        User user = new User();
        user.setName("Pedro");
        user.setSurname("Espin");
        user.setEmail("PedroEspin@correo.com");

        model.addAttribute("user", user);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(user.getName()));
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {
        List<User> users = Arrays.asList(new User("Pedro", "Espin", "PedroEspin@correo.com"),
                new User("Pablo", "Lopez", "PabloLopez@correo.com"),
                new User("Fran", "Lopez", "FranLopez@correo.com"),
                new User("Carlos", "Garcia", "CarlosGarcia@correo.com"));

        model.addAttribute("titulo", "Listado de usuarios");

        return "listar";
    }
    @ModelAttribute("usuarios")
    public List<User> poblarUsuarios(){
        List<User> users = Arrays.asList(new User("Pedro", "Espin", "PedroEspin@correo.com"),
                new User("Pablo", "Lopez", "PabloLopez@correo.com"),
                new User("Fran", "Lopez", "FranLopez@correo.com"),
                new User("Carlos", "Garcia", "CarlosGarcia@correo.com"));

        return users;
    }
}
