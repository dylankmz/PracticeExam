package be.second.model;

import java.util.HashSet;

public class Haven {

    private double maxLengte = 150;
    private double huidigeLengte = 0;
    private String naam;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getMaxLengte() {
        return maxLengte;
    }

    public void setMaxLengte(double maxLengte) {
        this.maxLengte = maxLengte;
    }

    public double getHuidigeLengte() {
        return huidigeLengte;
    }

    public void setHuidigeLengte(double huidigeLengte) {
        this.huidigeLengte = huidigeLengte;
    }

    //Niet gesorteerde lijst
    HashSet<Schip> schepen = new HashSet<>();

    public boolean aanmeren(Schip s) {
        System.out.println("Aanmeren van [" + s.toString() + "].");
        if (s.getLengte() + huidigeLengte >= maxLengte) {
            if (s instanceof Vrachtschip) {
                Vrachtschip v = (Vrachtschip) s;
                v.loods();
            }
            huidigeLengte = huidigeLengte + s.getLengte();
            schepen.add(s);
            return true;
        }
        System.out.println("Sorry er is geen plaats meer voor dit schip!");
        return false;
    }

    //Niet helemaal begrepen
    public void afmeren(String naam) throws Exception {
        Schip schip = null;

        for (Schip s: schepen
             ) {
            if (s.getNaam().equals(naam));
            schip = s;
        }

        if (schip == null) {
            throw new Exception("Afmeren mislukt: Schip: " + naam + " ligt niet in onze haven!");
        }
    }
}
