import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
	 //private JButton btnOK;

	public Calculadora(){
		super("");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel lbValue1 = new JLabel("Valor 1");
		JLabel lbOperation = new JLabel("(+ - / *)");
		JLabel lbValue2 = new JLabel("Valor 2");
		JLabel lbResult = new JLabel("Resultado");
		JButton btnEquals = new JButton("=");
		JTextField txtValue1 = new JTextField("");
		JTextField txtOperation = new JTextField("");
		JTextField txtValue2 = new JTextField("");
		JTextField txtEquals = new JTextField("");

		lbValue1.setBounds(10, 15, 70, 25);
		lbOperation.setBounds(150, 15, 70, 25);
		lbValue2.setBounds(300, 15, 70, 25);
		btnEquals.setBounds(450, 50, 70, 25);
		lbResult.setBounds(600, 15, 70, 25);
		txtValue1.setBounds(10, 50, 70, 25);
		txtOperation.setBounds(150, 50, 70, 25);
		txtValue2.setBounds(300, 50, 70, 25);
		txtEquals.setBounds(600, 50, 70, 25);

		//txtEquals.isEditable(false);
		Container c = getContentPane();
		c.setLayout(null);
		c.add(lbValue1);
		c.add(lbOperation);
		c.add(lbValue2);
		c.add(lbResult);
		c.add(btnEquals);
		c.add(txtValue1);
		c.add(txtOperation);
		c.add(txtValue2);
		c.add(txtEquals);

		txtEquals.setEditable(false);
		
		btnEquals.addActionListener(new ActionListener() {	
			//BigDecimal value1,value2;
			String operation;

			public void actionPerformed(ActionEvent e) {
				//value1 = Integer.parseInt(lbValue1.getText());
				operation = lbOperation.getText();
				//value2 = Integer.parseInt(lbValue2.getText());
				
				switch(operation) {
				case "+":break;
				case "-":break;
				case "/":break;
				case "*":break;
				default: JOptionPane.showMessageDialog(null, "Erro!");break;
				}
				

				txtEquals.setText("20");
			}
		});

		setVisible(true);
	}


public static void main(String[] args) {
	new Calculadora();
	}
}