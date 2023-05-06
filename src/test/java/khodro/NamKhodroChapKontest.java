package khodro;
import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamKhodroChapKontest {
    @Test
    void Bayad_Nam_Khodro_ra_chap_Konad() {
        Khodro benz=new Mashin("benz",220, Dande.MANUAL);
        Khodro volvo=new Mashin("volvo",240,Dande.MANUAL);
        Khodro honda=new Motor("honda",180,"normal");
        Khodro titanic=new Kashti("titanic");
        Khodro[] khodroha={benz,volvo,honda,titanic};
        NamKhoroChapKon namKhoroChapKon = new NamKhoroChapKon(khodroha);
        String listnamkhodroha = namKhoroChapKon.execute();
        Assertions.assertEquals("benz_volvo_honda_titanic",listnamkhodroha);
    }
}
