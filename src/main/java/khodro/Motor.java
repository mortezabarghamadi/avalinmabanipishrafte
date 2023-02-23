package khodro;

public class Motor extends Khodro{
    private String mark;
    private int sorat;
    private String noemotor;
    public Motor(String mark, int sorat, String noemotor) {
    this.mark=mark;
    this.sorat=sorat;
    this.noemotor=noemotor;
    }
    public void markkhodro(){
        System.out.println(name);
    }

    @Override
    public String getmark() {
        return mark;
    }


    public boolean ayaharekatmikonad() {
        return ayaRoshanAst;

    }
}
