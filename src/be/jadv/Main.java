package be.jadv;

import be.jadv.model.Haven;
import be.jadv.model.Vrachtschip;
import be.jadv.model.Zeilboot;


public class Main {

    public static void main(String[] args) {

        System.out.println("--- Hawa-Kiwi ---");
        Vrachtschip GroteFrans = new Vrachtschip();
        GroteFrans.setNaam("GroteFrans");
        GroteFrans.setLengte(100);
        GroteFrans.setLaadVermogen(2500);

        Vrachtschip SuperMaramiu = new Vrachtschip();
        SuperMaramiu.setNaam("SuperMaramiu");
        SuperMaramiu.setLengte(400);
        SuperMaramiu.setLaadVermogen(7500);

        Zeilboot SmalleSally = new Zeilboot();
        SmalleSally.setNaam("SmalleSally");
        SmalleSally.setLengte(15);
        SmalleSally.setMasten(1);

        Haven WallyKiwi = new Haven();
        WallyKiwi.setNaam("WallyKiwi");
        WallyKiwi.setLengte(150);

        WallyKiwi.aanmeren(GroteFrans);
        WallyKiwi.aanmeren(SmalleSally);
        GroteFrans.loods();

        WallyKiwi.aanmeren(SuperMaramiu);

        try {
            WallyKiwi.afmeren("BigFrans");
            WallyKiwi.afmeren("SmallSally");
            WallyKiwi.afmeren("GreatMaramiu");
        } catch (Exception e) {
            System.out.println("Afmeren mislukt " + e.getMessage());
        }

    }
}
