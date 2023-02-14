package khodro;

public class Mashin extends Khodro {
    boolean ayadarbazast;
    String mark;
    Rannade rannade;
    public Mashin(){
    }
    public Mashin(String mark){
        this.mark = mark;
    }
    public void markkhodro(){
        System.out.println(name);
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
}
