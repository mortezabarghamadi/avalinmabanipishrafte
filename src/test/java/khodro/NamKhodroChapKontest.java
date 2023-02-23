package khodro;
import khodro.Mashin;
import khodro.Khodro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamKhodroChapKontest {
    @Test
    void Bayad_Nam_Khodro_ra_chap_Konad() {
        Khodro benz=new Mashin("benz",220,"automatic");
        Khodro volvo=new Mashin("volvo",240,"manual");
        Khodro honda=new Motor("honda",180,"normal");
        Khodro[] khodroha={benz,volvo,honda};
        NamKhoroChapKon namKhoroChapKon = new NamKhoroChapKon(khodroha);
        String listnamkhodroha = namKhoroChapKon.execute();
        Assertions.assertEquals("benz_volvo_honda",listnamkhodroha);
    }
}
