package compare;

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Comparecollectiontest {
    @Test
    void compare_kardan() {
        ArrayList<Mashin> mashin1 = new ArrayList<>();
        mashin1.add(new Mashin("mustang",200, Dande.MANUAL));
        ArrayList<Mashin> mashin2 = new ArrayList<>();
        mashin2.add(new Mashin("mustang",200,Dande.MANUAL));
        Assertions.assertThat(mashin1.equals(mashin2));
    }

    @Test
    void compare_kardan_hashcode() {
        Set<Mashin> mashin1 = new HashSet<>();
        mashin1.add(new Mashin("mustang",200, Dande.MANUAL));
        Set<Mashin> mashin2 = new HashSet<>();
        mashin2.add(new Mashin("mustang",200,Dande.MANUAL));
        Assertions.assertThat(mashin1.equals(mashin2));
    }
}
