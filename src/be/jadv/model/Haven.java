package be.jadv.model;

import java.util.HashSet;

public class Haven extends Schip {

    private double maximumLengte = 150;
    private double huidigeLengte = 0;
    public String naam;

    private HashSet<Schip> schepen = new HashSet<>();

    public boolean aanmeren(Schip schip) {
        System.out.println("Aanmeren van [" + schip.toString() + ']');
        if (huidigeLengte + lengte <= maximumLengte) {
            if (schip instanceof Vrachtschip) {
                ((Vrachtschip) schip).loods();
                huidigeLengte += schip.lengte;
                schepen.add(schip);
            }
        }
        System.out.println("Sorry er is geen plaats meer voor dit schip!");
        return false;
    }

    public void afmeren(String naam) throws Exception {
        Schip schip = null;
        for (Schip s : schepen
        ) {
            if (s.getNaam().equals(naam)) {
                schip = s;
            }

            if (schip == null) {
                throw new Exception("Schip: " + naam + " ligt niet in onze haven!");
            }

            huidigeLengte -= schip.getLengte();
            schepen.remove(schip);
        }
    }



}
