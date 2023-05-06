package khodro.mashin;

public enum Dande {
    AUTOMATIC("otomatic","automatico"),
    MANUAL("dasti","manuale");
    private final String topersian;
    private final String toitalian;
    Dande(String topersian , String toitalian) {
        this.topersian=topersian;
        this.toitalian=toitalian;

    }




    public static void print() {
        Dande[] values = Dande.values();
        for (int index=0;index<values.length;index++){
            System.out.println(values[index]);
        }
    }

    public static void printinpersian() {

        Dande[] values = Dande.values();
        for (int index=0;index<values.length;index++){
            Dande value = values[index];
            System.out.println(value.topersian);
        }
    }

    public static void printinitalian() {
        Dande[] values = Dande.values();
        for(int index=0;index<values.length;index++){
            Dande value = values[index];
            System.out.println(value.toitalian);
        }
    }

    public String getTopersian() {
        return topersian;
    }
    public String getToitalian() {
        return toitalian;
    }
}
