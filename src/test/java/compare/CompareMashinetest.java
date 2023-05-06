package compare;

import khodro.Khodro;
import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import khodro.mashin.MashinComprator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CompareMashinetest {
    @Test
    void moghayese_mashinha() {
        Mashin bmw1 =new Mashin("bmw",220, Dande.AUTOMATIC);
        Mashin bmw2 =new Mashin("bmw",220, Dande.AUTOMATIC);
        Assertions.assertThat(Objects.equals(bmw1,bmw2)).isTrue();
    }

    @Test
    void should_sort_mashins() {
        Mashin bmw1 =new Mashin("bmw",240, Dande.MANUAL);
        Mashin bmw2 =new Mashin("bmw",220, Dande.AUTOMATIC);
        Mashin bmw3 =new Mashin("bmw",280, Dande.MANUAL);
        Mashin bmw4 =new Mashin("bmw",260, Dande.AUTOMATIC);
        ArrayList<Mashin> mashins = new ArrayList<>();
        mashins.add(bmw1);
        mashins.add(bmw2);
        mashins.add(bmw3);
        mashins.add(bmw4);
        Collections.sort(mashins);
        ArrayList<Mashin> expectedmashins = new ArrayList<>();
        expectedmashins.add(bmw2);
        expectedmashins.add(bmw1);
        expectedmashins.add(bmw4);
        expectedmashins.add(bmw3);


         Assertions.assertThat(mashins).isEqualTo(expectedmashins);
    }

    @Test
    void shuld_sort_mashins_by_comprator() {
        Mashin bmw =new Mashin("bmw",240, Dande.MANUAL);
        Mashin saipa =new Mashin("saipa",220, Dande.AUTOMATIC);
        Mashin ford =new Mashin("ford",280, Dande.MANUAL);
        Mashin mustang =new Mashin("mustang",260, Dande.AUTOMATIC);
        ArrayList<Mashin> mashins = new ArrayList<>();
        mashins.add(bmw);
        mashins.add(ford);
        mashins.add(mustang);
        mashins.add(saipa);
        Collections.sort(mashins,new MashinComprator());
        ArrayList<Mashin> expectedmashins = new ArrayList<>();
        expectedmashins.add(bmw);
        expectedmashins.add(ford);
        expectedmashins.add(mustang);
        expectedmashins.add(saipa);


    }

    @Test
    void map_test() {
        Mashin bmw1 =new Mashin("bmw1",240, Dande.MANUAL);
        Mashin bmw2 =new Mashin("bmw2",220, Dande.AUTOMATIC);
        Mashin bmw3 =new Mashin("bmw3",280, Dande.MANUAL);
        Mashin bmw4 =new Mashin("bmw4",260, Dande.AUTOMATIC);
        HashMap<Mashin, String> mashinhaymapi = new HashMap<>();
        mashinhaymapi.put(bmw1,"1990");
        mashinhaymapi.put(bmw2,"1985");
        mashinhaymapi.put(bmw3,"2006");
        mashinhaymapi.put(bmw4,"2014");
        Set<Map.Entry<Mashin, String>> entries = mashinhaymapi.entrySet();
        for (Map.Entry<Mashin, String> entry: entries) {
            Mashin key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key.getmark() +" modele "+ value);

    }


        }
}
