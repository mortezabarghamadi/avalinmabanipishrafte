package khodro;

import khodro.mashin.Dande;
import org.junit.jupiter.api.Test;

public class Dandetest {
    @Test
    void print_all_dande_values() {
        Dande.print();
    }

    @Test
    void print_all_dande_inpersian() {
        System.out.println("inpersian");
        Dande.printinpersian();
    }

    @Test
    void print_all_dande_initalian() {
        System.out.println("initalian");
        Dande.printinitalian();
    }
}
