package khodro.mashin;

import khodro.Khodro;
import khodro.Rannade;
import khodro.Sorat;
import khodro.Tormoz;

import java.util.Objects;

public  class Mashin extends Khodro implements Tormoz, Sorat , Comparable<Mashin> {

    public static int tedadforosh;
    private boolean ayadarbazast;
    private boolean ayaRoshanAst;
    private String mark;
    private int shetabmashin;
    private Dande dande;
    private Rannade rannande;

      public Mashin(){
       System.out.println("yek mashin zafe shod");
    }
//   public Mashin(String mark){
//      this.mark = mark;
//    }

    public Mashin(String mark , int shetabmashin , Dande dande) {
        this.mark=mark;
        this.shetabmashin=shetabmashin;
        this.dande=dande;
    }


//    public void markkhodro(){
//       System.out.println(name);
//    }

    @Override
    public String getmark() {
        return mark;
    }
    public void roshanKardan() {
        ayaRoshanAst = true;
    }

    public void khamoshKardan() {
        ayaRoshanAst = false;
    }

    void BazKardanDar() {
        ayadarbazast = true;
    }
    void bastanDar() {
        ayadarbazast = false;
    }

    public boolean ayaharekatmikonad() {
        if (ayaRoshanAst && !ayadarbazast) {
            return true;
        } else {
        return false;
        }
     }

    @Override
    public int shetab(){
         return 100;
    }
    @Override
    public String typetormoz(){

         return "ABS";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mashin mashin = (Mashin) o;
        return shetabmashin == mashin.shetabmashin && Objects.equals(mark, mashin.mark) && dande == mashin.dande;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, shetabmashin, dande);
    }

    @Override
    public int compareTo(Mashin mashindigar) {

          int moghayesemashinha =Integer.compare(this.shetabmashin , mashindigar.shetabmashin );
//        if (moghayesemashinha==0) {
//            if (Objects.equals(this.dande ,Dande.AUTOMATIC));{
//                return -1;
//            }
//        }else {
//            return 1;
//        }

           return moghayesemashinha;

        }
}
