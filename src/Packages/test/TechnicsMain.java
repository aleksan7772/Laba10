package Packages.test;

import Packages.technics.Passport;
import Packages.technics.PassportUtil;

import java.util.Date;


public class TechnicsMain {

    public static void main(String[] args) {
        Passport passport = new Passport("Alex", "CB 65184161", "Ukraine");
        System.out.println(passport);
        PassportUtil.warrantyReplaceas(passport);
        System.out.println(passport);
    }
}
