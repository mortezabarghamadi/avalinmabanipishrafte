import javax.swing.*;

public class CalculeterUI {

    public static void main(String[] args) {
        JFrame mashinhesab = new JFrame("mashin hesab");
        JTextField result = new JTextField();
        result.setBounds(0,0,200,50);
        result.setEnabled(false);

        JButton one = new JButton("1");
        one.setBounds(0,50,50,50);
        JButton two = new JButton("2");
        two.setBounds(50,50,50,50);
        JButton three = new JButton("3");
        three.setBounds(100,50,50,50);
        JButton plus = new JButton("+");
        plus.setBounds(150,50,50,50);
        JButton four = new JButton("4");
        four.setBounds(0,100,50,50);
        JButton five = new JButton("5");
        five.setBounds(50,100,50,50);
        JButton six = new JButton("6");
        six.setBounds(100,100,50,50);
        JButton minus = new JButton("-");
        minus.setBounds(150,100,50,50);
        JButton seven = new JButton("7");
        seven.setBounds(0,150,50,50);
        JButton eight = new JButton("8");
        eight.setBounds(50,150,50,50);
        JButton nine = new JButton("9");
        nine.setBounds(100,150,50,50);
        JButton multiply = new JButton("*");
        multiply.setBounds(150,150,50,50);
        JButton point = new JButton(".");
        point.setBounds(0,200,50,50);
        JButton zero = new JButton("0");
        zero.setBounds(50,200,50,50);
        JButton equal = new JButton("=");
        equal.setBounds(100,200,50,50);
        JButton division = new JButton("/");
        division.setBounds(150,200,50,50);


        mashinhesab.add(result);
        mashinhesab.add(one);
        mashinhesab.add(two);
        mashinhesab.add(three);
        mashinhesab.add(plus);
        mashinhesab.add(four);
        mashinhesab.add(five);
        mashinhesab.add(six);
        mashinhesab.add(minus);
        mashinhesab.add(seven);
        mashinhesab.add(eight);
        mashinhesab.add(nine);
        mashinhesab.add(multiply);
        mashinhesab.add(point);
        mashinhesab.add(zero);
        mashinhesab.add(equal);
        mashinhesab.add(division);
        mashinhesab.setSize(600,600);
        mashinhesab.setLayout(null);
        mashinhesab.setVisible(true);
    }
}
