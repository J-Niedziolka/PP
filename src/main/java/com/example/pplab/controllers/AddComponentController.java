package com.example.pplab.controllers;

import com.example.pplab.models.MuseumComponent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.time.LocalDate;

@Controller
@RequestMapping("/lab3zad1")
public class AddComponentController {
    @GetMapping("/*")
    public ModelAndView addComponent() throws IOException {
        MuseumComponent component = new MuseumComponent();
        component.setId(134);
        component.setAuthor("Kowalski");
        component.setTitle("Pejzaż");
        component.setIfExposition(true);
        component.setIfRenovation(false);
        component.setDate(LocalDate.of(1997, 10, 23));

        var mav = new ModelAndView("lab3/widok", "obraz", component);
        return mav;
    }

    //1.Zaimplementuj kolejny kontroler (lub metodę w istniejącym), który umieszcza w modelu listę komponentów JB.
}
