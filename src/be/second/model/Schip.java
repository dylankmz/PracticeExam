package be.second.model;

public abstract class Schip {

    private String naam;
    private double lengte;

    public Schip() {
    }

    public Schip(String naam, double lengte) {
        this.naam = naam;
        this.lengte = lengte;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    @Override
    public String toString() {
        return "Schip{" + "naam='" + naam + '\'' + ", lengte=" + lengte + '}';
    }
}
