package com.example.pplab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@Controller
@RequestMapping("/lab2zad3")
public class MyFirstController {
    Random random = new Random();
    @GetMapping("liczba")
    public void hello(HttpServletResponse response) throws IOException {
        response.getWriter().write("<H1>" + randomNum() + "</H1>");
    }
    @GetMapping("imi?")
    public void imie(HttpServletResponse response) throws IOException {
        response.getWriter().write("<H1>" + imieNazwisko() + "</H1>");
    }
    @GetMapping("*.html")
    public void serwerhtml(HttpServletResponse response) throws IOException {
        response.getWriter().write(
                "<H1>architektura systemu: " + serwerarch() + "</H1>" +
                "<H1>nazwa systemu: " + serwername() + "</H1>" +
                "<H1>producent jre: " + jreproducent() + "</H1>" +
                "<H1>wersja jre: " + jreversion() + "</H1>"
        );
    }

    protected  int randomNum() { return random.nextInt(); }
    protected String imieNazwisko() { return "Jan Niedziółka"; }

    protected String serwerarch(){
        return System.getProperty("os.arch");
    }
    protected String serwername(){
        return System.getProperty("os.name");
    }
    protected String jreproducent(){
        return System.getProperty("java.vendor");
    }
    protected String jreversion(){
        return System.getProperty("java.version");
    }
}
