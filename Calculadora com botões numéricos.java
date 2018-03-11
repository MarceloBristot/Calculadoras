import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

public class Calculadora extends JFrame{
    public String valueInsert = "0", operation;
    double value;
    boolean firstValue = true;
    public Calculadora(){
        super("Calc");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(215,160);
        setResizable(false);
        setLocationRelativeTo(null);
        JTextField resultText = new JTextField(valueInsert);
        resultText.setBounds(0,0,300,20);
        resultText.setEditable(false);

        //Número 0
        JButton btn0 = new JButton("0");
        btn0.setBounds(0,95,50,25);
        //btn9.setMnemonic();
        btn0.addActionListener(e -> {
            if(valueInsert =="0")
                valueInsert = "0";
            else
                valueInsert += 0;

            if(operation == null)
                firstValue = true;

            resultText.setText(valueInsert);

        });
        //Número 1
        JButton btn1 = new JButton("1");
        btn1.setBounds(0,70,50,25);
        //btn9.setMnemonic();
        btn1.addActionListener(e -> {
            if(valueInsert =="0")
                valueInsert = "1";
            else
                valueInsert += 1;

            if(operation == null)
                firstValue = true;

            resultText.setText(valueInsert);

        });

        //Número 2
        JButton btn2 = new JButton("2");
        btn2.setBounds(50,70,50,25);
        //btn9.setMnemonic();
        btn2.addActionListener(e -> {
            if(valueInsert =="0")
                valueInsert = "2";
            else
                valueInsert += 2;

            if(operation == null)
                firstValue = true;

            resultText.setText(valueInsert);

        });

        //Número 3
        JButton btn3 = new JButton("3");
        btn3.setBounds(100,70,50,25);
        //btn9.setMnemonic();
        btn3.addActionListener(e -> {
            if(valueInsert =="0")
                valueInsert = "3";
            else
                valueInsert += 3;

            if(operation == null)
                firstValue = true;

            resultText.setText(valueInsert);

        });

        //Número 4
        JButton btn4 = new JButton("4");
        btn4.setBounds(0,45,50,25);
        //btn9.setMnemonic();
        btn4.addActionListener(e -> {
            if(valueInsert =="0")
                valueInsert = "4";
            else
                valueInsert += 4;

            if(operation == null)
                firstValue = true;

            resultText.setText(valueInsert);

        });

        //Número 5
        JButton btn5 = new JButton("5");
        btn5.setBounds(50,45,50,25);
        //btn9.setMnemonic();
        btn5.addActionListener(e -> {
            if(valueInsert =="0")
                valueInsert = "5";
            else
                valueInsert += 5;

            if(operation == null)
                firstValue = true;

            resultText.setText(valueInsert);

        });

        //Número 6
        JButton btn6 = new JButton("6");
        btn6.setBounds(100,45,50,25);
        //btn9.setMnemonic();
        btn6.addActionListener(e -> {
            if(valueInsert =="0")
                valueInsert = "6";
            else
                valueInsert += 6;

            if(operation == null)
                firstValue = true;
            resultText.setText(valueInsert);

        });


        //Número 7
        JButton btn7 = new JButton("7");
        btn7.setBounds(0,20,50,25);
        //btn9.setMnemonic();
        btn7.addActionListener(e -> {
            if(valueInsert =="0")
                valueInsert = "7";
            else
                valueInsert += 7;

            if(operation == null)
                firstValue = true;
            resultText.setText(valueInsert);

        });

        //Número 8
        JButton btn8 = new JButton("8");
        btn8.setBounds(50,20,50,25);
        //btn9.setMnemonic();
        btn8.addActionListener(e -> {
            if(valueInsert =="0")
                valueInsert = "8";
            else
                valueInsert += 8;

            if(operation == null)
                firstValue = true;

            resultText.setText(valueInsert);

        });

        //Número 9
        JButton btn9 = new JButton("9");
        btn9.setBounds(100,20,50,25);
        //btn9.setMnemonic();
        btn9.addActionListener(e -> {
            if(valueInsert =="0")
                valueInsert = "9";
            else
                valueInsert += 9;

            if(operation == null)
                firstValue = true;

            resultText.setText(valueInsert);

        });

        //Vírgula (Ponto)
        JButton btnPoint = new JButton(".");
        btnPoint.setBounds(50,95,50,25);
        //btn9.setMnemonic();
        btnPoint.addActionListener(e -> {
            if(valueInsert.indexOf(".") >= 0)
                return;
            else
                valueInsert += ".";

            resultText.setText(valueInsert);

        });

        //Sinal de Divisão
        JButton btnDivision= new JButton("/");
        btnDivision.setBounds(150,20,50,25);
        btnDivision.addActionListener(e ->{
            //if(firstValue) {
            if(operation != null)
                return;
            if(firstValue)
                value = Double.parseDouble(valueInsert);
            operation = "/";
            resultText.setText("");
            valueInsert = "0";
            //}
        });

        //Sinal de Multiplicação
        JButton btnMultiplication= new JButton("*");
        btnMultiplication.setBounds(150,45,50,25);
        btnMultiplication.addActionListener(e ->{

            if(operation != null)
                return;

            operation = "*";

            if(firstValue)
                value = Double.parseDouble(valueInsert);
            valueInsert = "0";
            resultText.setText("");
        });


    //Sinal de Subtração
    value = Integer.parseInt(valueInsert);
        JButton btnMinus= new JButton("-");
        btnMinus.setBounds(150,70,50,25);
        btnMinus.addActionListener(e ->{

            if(operation != null)
                return;

            operation = "-";
            if(firstValue)
                value = Double.parseDouble(valueInsert);
            resultText.setText("");
            valueInsert = "0";
        });

        //Sinal de Adição
        JButton btnSum= new JButton("+");
        btnSum.setBounds(150,95,50,25);
        btnSum.addActionListener(e ->{

            if(operation != null)
                return;

            operation = "+";
            if(firstValue)
                value = Double.parseDouble(valueInsert);
            resultText.setText("");
            valueInsert = "0";
        });


        //Sinal de Igual
        JButton btnResult= new JButton("=");
        btnResult.setBounds(100,95,50,25);
        btnResult.addActionListener(e ->{
            double newValue = Double.parseDouble(valueInsert);
            if (operation == null)
                return;
            switch (operation){
                case "+":value = value + newValue;break;
                case "-":value = value - newValue;break;
                case "*":value = value * newValue;break;
                case "/":value = value / newValue;break;
                default: break;
            }
            valueInsert = "0";
            resultText.setText(String.valueOf(value));
            firstValue = false;
            operation = null;
        });

        Container c = getContentPane();
        c.setLayout(null);
        c.add(resultText);
        c.add(btn0);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);
        c.add(btn8);
        c.add(btn9);
        c.add(btnDivision);
        c.add(btnMultiplication);
        c.add(btnMinus);
        c.add(btnSum);
        c.add(btnPoint);
        c.add(btnResult);
        setVisible(true);

    }


    public static void main(String[] args){
        new Calculadora();
    }
}
