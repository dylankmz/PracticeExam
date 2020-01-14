package be.jadv.model;

public class Zeilboot extends Schip {

    private int masten;

    public Zeilboot() {
    }

    public Zeilboot(int masten) {
        this.masten = masten;
    }

    @Override
    public String toString() {
        return "Zeilboot: + naam: " + naam + ", masten: " + masten + ',' + " lengte" + lengte;
    }
}
