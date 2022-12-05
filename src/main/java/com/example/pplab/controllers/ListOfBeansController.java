package com.example.pplab.controllers;

import com.example.pplab.models.MuseumComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
@SpringBootApplication
@RequestMapping("/lab3zad3")
public class ListOfBeansController {
    @Autowired
    ApplicationContext applicationContext;

    public List listOfBeans(){
        return Arrays.asList(applicationContext.getBeanDefinitionNames());
    }

    @GetMapping("/*")
    public ModelAndView listaBeanow() throws IOException {
        var mav = new ModelAndView("lab3/lista");
        mav.addObject("lista", this.listOfBeans());
        return mav;
    }
}
