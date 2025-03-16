package model;

public class LesEenheid {

    // attributen

    protected String naam;
    protected int ects;
    protected int studiejaar;
    public static final double DEFAULTWAARDE_CIJFER = -1.0;
    public static final double GRENSWAARDE_VOLDOENDE = 5.50;

    // constructors

    public LesEenheid(String naam, int ects, int studiejaar) {
        this.setNaam(naam);
        this.setEcts(ects);
        this.setStudiejaar(studiejaar);
    }

    // methoden

    public String toString() {
        return naam + "\nects: " + ects + ", studiejaar: " + studiejaar;
    }

    // getters en setters

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public int getStudiejaar() {
        return studiejaar;
    }

    public void setStudiejaar(int studiejaar) {
        this.studiejaar = studiejaar;
    }
}
