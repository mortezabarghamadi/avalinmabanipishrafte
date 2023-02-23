package khodro;

public class NamKhoroChapKon {
    Khodro[] khodroha;
    public NamKhoroChapKon(Khodro[] khoroha) {
    this.khodroha = khoroha;
    }

    public String execute() {
        String namekhodroha="";
        for(int neshanegar=0;neshanegar< khodroha.length; neshanegar++)
        {
            Khodro khodro = khodroha[neshanegar];
            if(neshanegar!=khodroha.length -1) {
                namekhodroha = namekhodroha + khodro.getmark()+"_";
            }else {
                namekhodroha = namekhodroha + khodro.getmark();
            }
        }
        return namekhodroha;

    }
}
