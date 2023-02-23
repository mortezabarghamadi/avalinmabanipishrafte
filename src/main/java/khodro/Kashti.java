package khodro;

public class Kashti extends Khodro {
    String mark;

    public Kashti(String mark) {
        this.mark=mark;
    }

    @Override
    public boolean ayaharekatmikonad() {
        return false;
    }

//    @Override
//    public void markkhodro() {
//
//    }

    @Override
    public String getmark() {
        return mark;
    }
}
