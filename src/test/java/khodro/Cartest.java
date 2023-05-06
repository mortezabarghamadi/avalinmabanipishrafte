package khodro;

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import khodro.Rannade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Cartest {
    @Test
    void AmalkardMashin() {

        Mashin mustang = new Mashin("mustang",240, Dande.MANUAL);
        Mashin benz = new Mashin("benz",280,Dande.AUTOMATIC);

        boolean ayaHarekatMikonad = mustang.ayaharekatmikonad();
        benz.roshanKardan();
        boolean ayabenzHarekatMikonad = benz.ayaharekatmikonad();

        Assertions.assertFalse(ayaHarekatMikonad);
        Assertions.assertTrue(ayabenzHarekatMikonad);
        mustang.typetormoz();
        mustang.shetab();
        benz.typetormoz();
        benz.shetab();

        Rannade rannade = new Rannade();
    }
}
//       mashin.Mashin mashin = new mashin.Mashin();
//       mashin.bastanDar();
//        System.out.println("aya dar mashin baz ast?"+mashin.ayadarmashinbazast);
//        mashin.khamoshKardanmashin();
//       System.out.println("aya mashin roshan ast?"+mashin.ayaMashinRoshanAst);
//        mashin.ayaharekatmikonad();
//        System.out.println("...................................................");
//        mashin.Mashin camaro = new mashin.Mashin("camaro");
//        camaro.bastanDar();
//        System.out.println("aya dar mashin baz ast?"+camaro.ayadarmashinbazast);
//        camaro.roshanKardanmashin();
//        System.out.println("aya mashin roshan ast?"+camaro.ayaMashinRoshanAst);
//        camaro.ayaharekatmikonad();
