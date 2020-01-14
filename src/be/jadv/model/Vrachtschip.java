package be.jadv.model;

public class Vrachtschip extends Schip implements Loodsbaar {

    private double laadVermogen;

    public Vrachtschip() {
    }

    public Vrachtschip(String naam, double lengte, double laadVermogen) {
        super(naam, lengte);
        this.laadVermogen = laadVermogen;
    }

    @Override
    public String toString() {
        return "Vrachtschip: " + naam + "lengte " +  lengte + ',' + "laadvermogen: " + laadVermogen;
    }

    @Override
    public void loods() {
        System.out.println("Vrachtschip GroteFrans loodsen...");
    }
}
