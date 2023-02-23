package khodro;

public  class Mashin extends Khodro implements Tormoz,Sorat{
    boolean ayadarbazast;

    String mark;
    int shetabmashin;
    String dande;
    Rannade rannade;

     public Mashin(){
    }
    public Mashin(String mark){
        this.mark = mark;
    }

    public Mashin(String mark , int shetabmashin ,String dande) {
        this.mark=mark;
        this.shetabmashin=shetabmashin;
        this.dande=dande;
    }


    public void markkhodro(){
       System.out.println(name);
    }

    @Override
    public String getmark() {
        return mark;
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
    }@Override
    public String typetormoz(){

         return "ABS";
    }
}
