package model;

public class Vak extends LesEenheid {

    // attributen

    private double cijfer;


    // constructors

    public Vak(double cijfer, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.cijfer = cijfer;
    }

    public Vak (String naam, int ects, int studiejaar) {
        this(DEFAULTWAARDE_CIJFER, naam,ects,studiejaar);
    }

    // methoden

    public String isAfgerond() {
        double afgerondeCijfer = (double) Math.round(this.cijfer * 100) / 100;
        if (afgerondeCijfer >= GRENSWAARDE_VOLDOENDE) {
            return "ja";
        }
        else {
            return "nee";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\ncijfer: " + cijfer;
    }

    // getters en setters

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }
}
