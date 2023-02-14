package khodro;

public class Motor {
    boolean ayaRoshanAst;

    public void roshanKardan() {
        ayaRoshanAst = true;
    }

    public void khamoshKardan() {
        ayaRoshanAst = false;
    }

    public boolean ayaharekatmikonad() {
        return ayaRoshanAst;

    }
}
