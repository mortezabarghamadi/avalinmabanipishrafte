import javax.swing.*;

public class CalculeterUI {
    private static JTextField result;
    public static void main(String[] args) {
        JFrame mashinhesab = new JFrame("mashin hesab");
        result = new JTextField();
        result.setBounds(0,0,150,50);
        result.setEditable(false);

        JButton cancel = new JButton("C");
        cancel.setBounds(150,0,50,50);
        cancel.addActionListener(event-> result.setText(""));

        JButton one = getButton("1", 0, 50);
        JButton two = getButton("2", 50, 50);
        JButton three = getButton("3", 100, 50);

        JButton plus = new JButton("+");
        plus.setBounds(150,50,50,50);

        JButton four = getButton("4", 0, 100);
        JButton five = getButton("5", 50, 100);
        JButton six = getButton("6", 100, 100);

        JButton minus = new JButton("-");
        minus.setBounds(150,100,50,50);

        JButton seven = getButton("7", 0, 150);
        JButton eight = getButton("8", 50, 150);
        JButton nine = getButton("9", 100, 150);

        JButton multiply = new JButton("*");
        multiply.setBounds(150,150,50,50);

        JButton point = getButton(".", 0, 200);
        JButton zero = getButton("0", 50, 200);

        JButton equal = new JButton("=");
        equal.setBounds(100,200,50,50);

        JButton division = new JButton("/");
        division.setBounds(150,200,50,50);


        mashinhesab.add(result);
        mashinhesab.add(cancel);
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

    private static JButton getButton(String label, int xposition, int yposition) {
        JButton button= new JButton(label);
        button.setBounds(xposition, yposition,50,50);
        button.addActionListener(event -> result.setText(result.getText() + button.getText()));
        return button;
    }
}
