package model;

public class ProfessionalSkills extends LesEenheid {

    // attributen

    private boolean gehaald;
    private static final boolean DEFAULTWAARDE_GEHAALD = false;

    // constructors

    public ProfessionalSkills(boolean gehaald, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.gehaald = gehaald;
    }

    public ProfessionalSkills(String naam, int ects, int studiejaar) {
        this(DEFAULTWAARDE_GEHAALD, naam, ects, studiejaar);
    }

    // methoden

    public String isAfgerond() {
        if (this.gehaald) {
            return "ja";
        }
        else {
            return "nee";
        }
    }

    @Override
    public String toString() {
        String welNietGehaald;

        if (gehaald) {
            welNietGehaald = "gehaald";
        }
        else {
            welNietGehaald = "niet gehaald";
        }

        return super.toString() + "\n" + welNietGehaald;
    }

    // getters en setters

    public void setGehaald(boolean gehaald) {
        this.gehaald = gehaald;
    }
}
