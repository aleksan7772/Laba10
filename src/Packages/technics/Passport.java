package Packages.technics;

import java.util.Date;

/**
 * Паспорт на технику
 */
public class Passport {
    private String name;
    private String number;
    private String country;
    private java.util.Date Date;

    public Passport(String name, String number, String country, java.util.Date date) {
        this.name = name;
        this.number = number;
        this.country = country;
        Date = date;
    }
}
