package Packages.citizen;

import java.util.Random;

/**
 * Паспорт гражданина
 */
public class Passport {
    private String name;
    private String id;
    private String spouseId;
    private String country;

    public Passport() {

    }

    public Passport(String name, String id, String country) {
        this.name = name;
        this.id = id;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(String spouseId) {
        this.spouseId = spouseId;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", spouseId='" + spouseId + '\'' +
                ", country='" + country + '\'' +
                '}' ;
    }
}