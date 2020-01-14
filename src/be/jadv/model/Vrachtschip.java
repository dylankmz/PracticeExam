package be.jadv.model;

public class Vrachtschip extends Schip implements Loodsbaar {

    private double laadVermogen;

    public Vrachtschip() {
    }

    public Vrachtschip(double laadVermogen) {
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
