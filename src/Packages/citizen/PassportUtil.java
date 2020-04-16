package Packages.citizen;

public class PassportUtil  {
    private PassportUtil() {
        System.out.println("Закрытый конструктор");
    }


    public static void marriageRegistrate(Passport passport,Passport passport2) {
        passport.setSpouseId(passport2.getId());
        passport2.setSpouseId(passport.getId());
        System.out.println(passport.getSpouseId());
        System.out.println(passport2.getSpouseId());
    }

}



