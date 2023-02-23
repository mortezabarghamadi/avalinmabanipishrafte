package khodro;

public abstract class Khodro {

    boolean ayaRoshanAst;
    String name = "honda";

    public void roshanKardan() {
        ayaRoshanAst = true;
    }

    public void khamoshKardan() {
        ayaRoshanAst = false;
    }


    public abstract boolean ayaharekatmikonad();

//    public abstract void markkhodro();

    public abstract String getmark();
}
