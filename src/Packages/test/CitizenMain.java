package Packages.test;

import Packages.citizen.Passport;
import Packages.citizen.PassportUtil;


public class CitizenMain {

    public static void main(String[] args) {
        Passport passport = new Passport("Alex","64646416484", "Ukraine" );
        Passport passport2 = new Passport("Elen","5651541561514", "Ukraine");

        PassportUtil.marriageRegistrate();
    }

}
