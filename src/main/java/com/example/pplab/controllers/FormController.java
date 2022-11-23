package com.example.pplab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/lab2zad5")
public class FormController {
    @GetMapping("form*")
    protected String showForm() throws IOException {
        return "lab2/formularz";
    }
    @RequestMapping("/ksiazka")
    public ModelAndView processForm(HttpServletRequest request) throws IOException{
        Map<String, String> map = new HashMap<>();
        map.put("title", request.getParameter("title"));
        map.put("author", request.getParameter("author"));
        map.put("year", request.getParameter("year"));
        map.put("isbn", request.getParameter("isbn"));

        var mav = new ModelAndView("lab2/ksiazka", map);
        return mav;
    }
}
