package com.example.pplab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping("/lab2zad4")
public class SecondController {
    @GetMapping("/liczba")
    protected String handleRequest(Model model) throws Exception {
        model.addAttribute("numer", randomNum());
        return "lab2/liczba";
    }
    @GetMapping("/imi?")
    protected ModelAndView imie() throws IOException {
        //var mav = new ModelAndView("imie", "moje", "Jan");
        //mav.addObject("nazwisko", "Niedziolka");
        var mav = new ModelAndView("lab2/imie","name","Jan");
        mav.addObject("surname","Niedziółka");
        return mav;
    }
    @GetMapping("*.info")
    protected ModelAndView serwer() throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("architektura", System.getProperty("os.arch"));
        map.put("nazwa", System.getProperty("os.name"));
        map.put("producent", System.getProperty("java.vendor"));
        map.put("version", System.getProperty("java.version"));

        var mav = new ModelAndView("lab2/info", map);
        return mav;
    }



    Random random = new Random();
    protected int randomNum(){
        return random.nextInt();
    }

}
