package Packages.transport;

/**
 * Паспорт на авто
 */
public class Passport {
    private String name;
    private int[] number;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNumber(int random) {
    }
}
