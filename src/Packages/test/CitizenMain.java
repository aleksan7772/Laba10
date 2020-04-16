package Packages.test;

import Packages.citizen.Passport;
import Packages.citizen.PassportUtil;


public class CitizenMain {

    public static void main(String[] args) {
        Passport p = new Passport("Alex","64646416484", "Ukraine" );
        Passport p2 = new Passport("Elen","5651541561514", "Ukraine");
        System.out.println(p);
        System.out.println(p2);
        PassportUtil.marriageRegistrate(p,p2);
        System.out.println(p);
        System.out.println(p2);

    }

}
