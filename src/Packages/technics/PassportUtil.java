package Packages.technics;

import java.util.Date;

public class PassportUtil {

    public static void warrantyReplaceas(Passport passport) {
        Date date1 = new Date();
        passport.setDate(date1);
    }

}
