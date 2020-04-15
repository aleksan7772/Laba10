package Packages.citizen;


import Packages.test.CitizenMain;

import java.util.Arrays;

public class PassportUtil  {
    private PassportUtil() {
        System.out.println("Закрытый конструктор");
    }


    public static void marriageRegistrate() {
        Passport passport = new Passport();
        Passport passport2 = new Passport();
        passport.setSpouseId(passport.getId());
        passport2.setSpouseId(passport.getId());
        System.out.println(passport.getSpouseId());
        System.out.println(passport2.getSpouseId());
    }

}



