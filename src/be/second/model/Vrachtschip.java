package be.second.model;

public class Vrachtschip extends Schip implements Loodsbaar {

    private double laadVermogen;

    public Vrachtschip() {
    }

    public Vrachtschip(String naam, double lengte, double laadVermogen) {
        super(naam, lengte);
        this.laadVermogen = laadVermogen;
    }

    public double getLaadVermogen() {
        return laadVermogen;
    }

    public void setLaadVermogen(double laadVermogen) {
        this.laadVermogen = laadVermogen;
    }

    @Override
    public String toString() {
        return "Vrachtschip: " + getNaam() + " " + getLengte() + ", " + "laadvermogen: " + laadVermogen;
    }

    @Override
    public void loods() {
        System.out.println("Vrachtschip " + getNaam() + " " + "loodsen...");
    }
}
