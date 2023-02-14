import khodro.Mashin;
import khodro.Rannade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Cartest {
    @Test
    void AmalkardMashin() {
        Mashin mashin = new Mashin();
        Mashin mustang = new Mashin("mustang");
        Mashin benz = new Mashin("benz");

        boolean ayaHarekatMikonad = mustang.ayaharekatmikonad();
        benz.roshanKardan();
        boolean ayabenzHarekatMikonad = benz.ayaharekatmikonad();
        Assertions.assertFalse(ayaHarekatMikonad);
        Assertions.assertTrue(ayabenzHarekatMikonad);
        mashin.markkhodro();

        Rannade rannade = new Rannade();
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
    }
}


