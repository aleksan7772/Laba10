package Packages.transport;

public class PassportUtil {
    public static Passport changeOwner(Passport passport) {
        Passport passport2 = new Passport("Tom", "6156656541", "USA");
        passport = passport2;
        System.out.println(passport);
        return passport;
    }

}
