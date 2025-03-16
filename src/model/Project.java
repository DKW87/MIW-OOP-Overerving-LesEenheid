package model;

public class Project extends LesEenheid {

    // attributen

    private double productCijfer;
    private double procesCijfer;
    private double methodenEnTechniekCijfer;

    // constructors

    public Project(double productCijfer, double procesCijfer, double methodenEnTechniekCijfer, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.productCijfer = productCijfer;
        this.procesCijfer = procesCijfer;
        this.methodenEnTechniekCijfer = methodenEnTechniekCijfer;
    }

    public Project(String naam, int ects, int studiejaar) {
        this(DEFAULTWAARDE_CIJFER, DEFAULTWAARDE_CIJFER, DEFAULTWAARDE_CIJFER, naam, ects, studiejaar);
    }

    // methoden

    public String isAfgerond() {
        double afgerondeProductCijfer = (double) Math.round(this.productCijfer * 100) / 100;
        double afgerondeProcesCijfer = (double) Math.round(this.procesCijfer * 100) / 100;
        double afgerondeMnTCijfer = (double) Math.round(this.methodenEnTechniekCijfer * 100) / 100;

        if (afgerondeProductCijfer >= GRENSWAARDE_VOLDOENDE && afgerondeProcesCijfer >= GRENSWAARDE_VOLDOENDE && afgerondeMnTCijfer >= GRENSWAARDE_VOLDOENDE ) {
            return "ja";
        }
        else {
            return "nee";
        }

    }

    @Override
    public String toString() {
        return super.toString() + "\ncijfers(" + productCijfer + ", " + procesCijfer + ", " + methodenEnTechniekCijfer + ")";
    }

    // getters en setters

    public void setProductCijfer(double productCijfer) {
        this.productCijfer = productCijfer;
    }

    public void setProcesCijfer(double procesCijfer) {
        this.procesCijfer = procesCijfer;
    }

    public void setMethodenEnTechniekCijfer(double methodenEnTechniekCijfer) {
        this.methodenEnTechniekCijfer = methodenEnTechniekCijfer;
    }
}
