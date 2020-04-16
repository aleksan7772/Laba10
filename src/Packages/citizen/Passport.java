package Packages.citizen;


import java.util.Objects;

/**
 * Паспорт гражданина
 */
public class Passport {
    private String name;
    private String id;
    private String spouseId;
    private String country;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return name.equals(passport.name) &&
                id.equals(passport.id) &&
                spouseId.equals(passport.spouseId) &&
                country.equals(passport.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, spouseId, country);
    }
}