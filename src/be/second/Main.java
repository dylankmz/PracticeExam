package be.second;

import be.second.model.Haven;
import be.second.model.Vrachtschip;
import be.second.model.Zeilboot;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Haven-Kiwi ---");
        Vrachtschip v1 = new Vrachtschip();
        v1.setNaam("GroteFrans");
        v1.setLengte(100);
        v1.setLaadVermogen(2500);

        Vrachtschip v2 = new Vrachtschip();
        v2.setNaam("SuperMaramiu");
        v2.setLengte(400);
        v2.setLaadVermogen(7500);

        Zeilboot z1 = new Zeilboot();
        z1.setNaam("SmalleSally");
        z1.setLengte(15);
        z1.setMasten(1);

        //Wally-Kiwi haven aanmaken.
        Haven h1 = new Haven();
        h1.setNaam("Wally-Kiwi");
        h1.setMaxLengte(150);

        //GroteFrans en SmalleSally aanmeren, GroteFrans wordt geloodsd.
        h1.aanmeren(v1);
        h1.aanmeren(z1);
        v1.loods();

        //SuperMaramiu aanmeren (mag niet lukken).
        h1.aanmeren(v2);

        //GroteFrans, SmalleSally en SuperMaramiu afmeren, SchipNietGevonden exception gesmeten worden.
        try {
            h1.afmeren("GroteFrans");
            h1.afmeren("SmalleSally");
            h1.afmeren("SuperMaramiu");
        } catch (Exception e) {
            System.out.println("Afmeren mislukt: " + e.getMessage());
        }

    }
}
