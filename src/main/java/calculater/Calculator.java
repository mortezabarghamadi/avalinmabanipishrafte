package calculater;

public class Calculator {


    public String add(String adadaval, String adaddovom) {
        double a1=Double.parseDouble(adadaval);
        double a2=Double.parseDouble(adaddovom);
        double result=a1+a2;
        return String.valueOf(result);
    }

    public String subt(String adadavalb, String adaddovomb) {
        double b1=Double.parseDouble(adadavalb);
        double b2=Double.parseDouble(adaddovomb);
        double subtraction= b1 - b2;
        return String.valueOf(subtraction);
    }


    public String multi(String adadavalc, String adaddovomc) {
       double c1=Double.parseDouble(adadavalc);
       double c2= Double.parseDouble(adaddovomc);
       double mulltiply=c1*c2;
        return String.valueOf(mulltiply);
    }
}
