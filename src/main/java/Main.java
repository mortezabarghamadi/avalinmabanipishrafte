import khodro.mashin.Dande;
import khodro.mashin.Mashin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }
            String mark = args[0];
            String sorsat = args[1];
            Dande noedande = Dande.valueOf(args[2]);
            Mashin mashin = new Mashin(mark, Integer.parseInt(sorsat), noedande);
         if (mashin.ayaharekatmikonad()){
            System.out.println("mashin harekat mikonad");
        }else {
            System.out.println("mashin park ast");
        }
        System.out.println(mashin.getmark());
            Scanner scanner = new Scanner(System.in);
            System.out.println("payan ejra");
        System.out.println("لطفا نام خود را وارد کنید");
        String nam= scanner.nextLine();
        System.out.println("لطفا سن خود را وارد کنید");
        String sen= scanner.nextLine();
        System.out.println("لطفا شهر خود را وارد کنید");
        String shahrmahalzendegi= scanner.nextLine();
        System.out.println(" من "+nam+" هستم و "+sen+" سال دارم و در شهر "+shahrmahalzendegi+" زندگی میکنم ");
        System.out.println(" سلام "+nam+",از آشنایی باهات خوشبختم");
    }


}
