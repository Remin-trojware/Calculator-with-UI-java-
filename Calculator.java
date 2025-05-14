import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	JFrame jf;
	JLabel displaylabel;
	JButton jb;
	JButton eight, nine, four, five, six,
	one, two, three, dot, zero, equal, div,
	multi, plus, minus, clr;
	
	boolean isoperatorclicked = false;
	String oldvalue = "";
	String operator = "";

	public static void main(String a[]) {
		new Calculator();
	}

	public Calculator() {

		jf = new JFrame("Calculator");
		jf.setSize(600, 600);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		displaylabel = new JLabel();
		displaylabel.setBounds(30, 50, 540, 40);
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.green);
		jf.add(displaylabel);

		jb = new JButton("7");
		jb.setBounds(30, 120, 80, 80);
		jf.add(jb);
		jb.addActionListener(this);

		eight = new JButton("8");
		eight.setBounds(130, 120, 80, 80);
		jf.add(eight);
		eight.addActionListener(this);

		nine = new JButton("9");
		nine.setBounds(230, 120, 80, 80);
		jf.add(nine);
		nine.addActionListener(this);

		four = new JButton("4");
		four.setBounds(30, 220, 80, 80);
		jf.add(four);
		four.addActionListener(this);

		five = new JButton("5");
		five.setBounds(130, 220, 80, 80);
		jf.add(five);
		five.addActionListener(this);

		six = new JButton("6");
		six.setBounds(230, 220, 80, 80);
		jf.add(six);
		six.addActionListener(this);

		one = new JButton("1");
		one.setBounds(30, 320, 80, 80);
		jf.add(one);
		one.addActionListener(this);

		two = new JButton("2");
		two.setBounds(130, 320, 80, 80);
		jf.add(two);
		two.addActionListener(this);

		three = new JButton("3");
		three.setBounds(230, 320, 80, 80);
		jf.add(three);
		three.addActionListener(this);

		dot = new JButton(".");
		dot.setBounds(30, 420, 80, 80);
		jf.add(dot);
		dot.addActionListener(this);

		zero = new JButton("0");
		zero.setBounds(130, 420, 80, 80);
		jf.add(zero);
		zero.addActionListener(this);

		equal = new JButton("=");
		equal.setBounds(230, 420, 80, 80);
		jf.add(equal);
		equal.addActionListener(this);

		div = new JButton("/");
		div.setBounds(330, 120, 80, 80);
		jf.add(div);
		div.addActionListener(this);

		multi = new JButton("x");
		multi.setBounds(330, 220, 80, 80);
		jf.add(multi);
		multi.addActionListener(this);

		plus = new JButton("+");
		plus.setBounds(330, 320, 80, 80);
		jf.add(plus);
		plus.addActionListener(this);

		minus = new JButton("-");
		minus.setBounds(330, 420, 80, 80);
		jf.add(minus);
		minus.addActionListener(this);

		clr = new JButton("clr");
		clr.setBounds(430, 420, 80, 80);
		jf.add(clr);
		clr.addActionListener(this);

		jf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb) {
			if (isoperatorclicked) {
				displaylabel.setText("7");
				isoperatorclicked = false;
			} else {
				String labeltxt = displaylabel.getText();
				displaylabel.setText(labeltxt + "7");
			}
		} else if (e.getSource() == eight) {
			if (isoperatorclicked) {
				displaylabel.setText("8");
				isoperatorclicked = false;
			} else {
				displaylabel.setText(displaylabel.getText() + "8");
			}
		} else if (e.getSource() == nine) {
			if (isoperatorclicked) {
				displaylabel.setText("9");
				isoperatorclicked = false;
			} else {
				displaylabel.setText(displaylabel.getText() + "9");
			}
		} else if (e.getSource() == four) {
			if (isoperatorclicked) {
				displaylabel.setText("4");
				isoperatorclicked = false;
			} else {
				displaylabel.setText(displaylabel.getText() + "4");
			}
		} else if (e.getSource() == five) {
			if (isoperatorclicked) {
				displaylabel.setText("5");
				isoperatorclicked = false;
			} else {
				displaylabel.setText(displaylabel.getText() + "5");
			}
		} else if (e.getSource() == six) {
			if (isoperatorclicked) {
				displaylabel.setText("6");
				isoperatorclicked = false;
			} else {
				displaylabel.setText(displaylabel.getText() + "6");
			}
		} else if (e.getSource() == one) {
			if (isoperatorclicked) {
				displaylabel.setText("1");
				isoperatorclicked = false;
			} else {
				displaylabel.setText(displaylabel.getText() + "1");
			}
		} else if (e.getSource() == two) {
			if (isoperatorclicked) {
				displaylabel.setText("2");
				isoperatorclicked = false;
			} else {
				displaylabel.setText(displaylabel.getText() + "2");
			}
		} else if (e.getSource() == three) {
			if (isoperatorclicked) {
				displaylabel.setText("3");
				isoperatorclicked = false;
			} else {
				displaylabel.setText(displaylabel.getText() + "3");
			}
		} else if (e.getSource() == dot) {
			displaylabel.setText(displaylabel.getText() + ".");
		} else if (e.getSource() == zero) {
			displaylabel.setText(displaylabel.getText() + "0");
		} else if (e.getSource() == equal) {
			// Perform the calculation based on the operator
			float newvaluef = Float.parseFloat(displaylabel.getText());
			float result = 0;
			switch (operator) {
				case "+":
					result = Float.parseFloat(oldvalue) + newvaluef;
					break;
				case "-":
					result = Float.parseFloat(oldvalue) - newvaluef;
					break;
				case "x":
					result = Float.parseFloat(oldvalue) * newvaluef;
					break;
				case "/":
					if (newvaluef != 0) {
						result = Float.parseFloat(oldvalue) / newvaluef;
					} else {
						displaylabel.setText("Error");
						return;
					}
					break;
			}
			displaylabel.setText(result + "");
			operator = "";
		} else if (e.getSource() == div) {
			operator = "/";
			oldvalue = displaylabel.getText();
			isoperatorclicked = true;
		} else if (e.getSource() == multi) {
			operator = "x";
			oldvalue = displaylabel.getText();
			isoperatorclicked = true;
		} else if (e.getSource() == plus) {
			operator = "+";
			oldvalue = displaylabel.getText();
			isoperatorclicked = true;
		} else if (e.getSource() == minus) {
			operator = "-";
			oldvalue = displaylabel.getText();
			isoperatorclicked = true;
		} else if (e.getSource() == clr) {
			displaylabel.setText("");
			oldvalue = "";
			operator = "";
		}
	}
}