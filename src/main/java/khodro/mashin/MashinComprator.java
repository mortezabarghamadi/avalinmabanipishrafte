package khodro.mashin;

import java.util.Comparator;

public class MashinComprator implements Comparator<Mashin> {

    public int compare(Mashin mashin1 , Mashin mashin2){
        return mashin1.getmark().compareTo(mashin2.getmark());
    }
}
