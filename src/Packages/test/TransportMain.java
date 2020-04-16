package Packages.test;

import Packages.transport.Passport;
import Packages.transport.PassportUtil;

public class TransportMain {
    public static void main(String[] args) {
        Passport p = new Passport("Alex", "61651616", "Ukraine");
        System.out.println(p);
        PassportUtil.changeOwner(p);
    }
}
