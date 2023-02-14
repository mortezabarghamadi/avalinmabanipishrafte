package khodro;

public class Mashin {
    boolean ayaRoshanAst;
    boolean ayadarbazast;
    String mark;
    Rannade rannade;
    Mashin(){
    }
    public Mashin(String mark){
        this.mark = mark;
    }


    void BazKardanDar() {
        ayadarbazast = true;
    }
    void bastanDar() {
        ayadarbazast = false;
    }

    public void roshanKardan() {
        ayaRoshanAst = true;
    }

    public void khamoshKardan() {
        ayaRoshanAst = false;
    }
    public boolean ayaharekatmikonad() {
        if (ayaRoshanAst && !ayadarbazast) {
            return true;
        } else {
            return false;

        }
    }
}
