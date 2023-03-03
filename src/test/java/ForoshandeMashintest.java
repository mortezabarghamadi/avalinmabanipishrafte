import foroshande.Foroshande;
import khodro.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForoshandeMashintest {

        @Test
        void Bayad_Tedad_Kol_Mashinhaye_Forokhte_Shode_Ra_Bedanad() {
            Foroshande ali= new Foroshande();
            Foroshande naser = new Foroshande();
            ali.foroshmashin();
            ali.foroshmashin();
            ali.foroshmashin();
            ali.foroshmashin();
            naser.foroshmashin();
            Assertions.assertEquals(5, Mashin.tedadforosh);
}}
