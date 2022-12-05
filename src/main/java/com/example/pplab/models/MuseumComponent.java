package com.example.pplab.models;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MuseumComponent {
    /*
    14.	Wirtualne muzeum (kolekcje obrazów, historia, informacje o autorach, możliwość umówienia wizyty grupowej z przewodnikiem, itp),
    a.	Long id,
    b.	String – takich właściwości jest zazwyczaj kilka,
    c.	LocalDate,
    d.	Float,
    e.	Boolean,
    LocalDate date = LocalDate.of(rok, miesiąc, dzień);
    */
    private int id;
    private String title;
    private String author;
    private LocalDate date;
    private Boolean ifRenovation;
    private Boolean ifExposition;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getIfRenovation() {
        return ifRenovation;
    }

    public void setIfRenovation(Boolean ifRenovation) {
        this.ifRenovation = ifRenovation;
    }

    public Boolean getIfExposition() {
        return ifExposition;
    }

    public void setIfExposition(Boolean ifExposition) {
        this.ifExposition = ifExposition;
    }
}
