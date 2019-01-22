
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Puzzle extends Frame implements ActionListener {
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, exit, cont;

	Puzzle() {
		super("Puzzle");
		Random rand = new Random();
		int rd = rand.nextInt(5);
		if(rd == 0){
			setBackground(Color.GREEN);
		}
		if(rd == 1){
			setBackground(Color.magenta);
		}
		if(rd == 2){
			setBackground(Color.PINK);
		}
		if(rd == 3){
			setBackground(Color.gray);
		}
		if(rd == 4){
			setBackground(Color.CYAN);
		}
		
		String[] s = rand();
		b1 = new Button(s[0]);
		b1.setBounds(50, 100, 40, 40);
		b2 = new Button(s[1]);
		b2.setBounds(100, 100, 40, 40);
		b3 = new Button(s[2]);
		b3.setBounds(150, 100, 40, 40);
		b4 = new Button(s[3]);
		b4.setBounds(200, 100, 40, 40);
		b5 = new Button(s[4]);
		b5.setBounds(50, 150, 40, 40);
		b6 = new Button(s[5]);
		b6.setBounds(100, 150, 40, 40);
		b7 = new Button(s[6]);
		b7.setBounds(150, 150, 40, 40);
		b8 = new Button(s[7]);
		b8.setBounds(200, 150, 40, 40);
		b9 = new Button(s[8]);
		b9.setBounds(50, 200, 40, 40);
		b10 = new Button(s[9]);
		b10.setBounds(100, 200, 40, 40);
		b11 = new Button(s[10]);
		b11.setBounds(150, 200, 40, 40);
		b12 = new Button(s[11]);
		b12.setBounds(200, 200, 40, 40);
		b13 = new Button(s[12]);
		b13.setBounds(50, 250, 40, 40);
		b14 = new Button(s[13]);
		b14.setBounds(100, 250, 40, 40);
		b15 = new Button(s[14]);
		b15.setBounds(150, 250, 40, 40);
		b16 = new Button("");
		b16.setBounds(200, 250, 40, 40);
		exit = new Button("Exit");
		exit.setBounds(70, 320, 60, 25);
		cont = new Button("Continue");
		cont.setBounds(150, 320, 60, 25);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		exit.addActionListener(this);
		cont.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(exit);
		add(cont);
		setSize(300, 400);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			String label = b1.getLabel();
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b1.setLabel("");
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b1.setLabel("");
			}
		}
		if (e.getSource() == b2) {
			String label = b2.getLabel();
			if (b1.getLabel().equals("")) {
				b1.setLabel(label);
				b2.setLabel("");
			}
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b2.setLabel("");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b2.setLabel("");
			}
		}
		if (e.getSource() == b3) {
			String label = b3.getLabel();
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b3.setLabel("");
			}
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b3.setLabel("");
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b3.setLabel("");
			}
		}
		if (e.getSource() == b4) {
			String label = b4.getLabel();
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b4.setLabel("");
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b4.setLabel("");
			}
		}
		if (e.getSource() == b5) {
			String label = b5.getLabel();
			if (b1.getLabel().equals("")) {
				b1.setLabel(label);
				b5.setLabel("");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b5.setLabel("");
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b5.setLabel("");
			}
		}
		if (e.getSource() == b6) {
			String label = b6.getLabel();
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b6.setLabel("");
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b6.setLabel("");
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b6.setLabel("");
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b6.setLabel("");
			}
		}
		if (e.getSource() == b7) {
			String label = b7.getLabel();
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b7.setLabel("");
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b7.setLabel("");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b7.setLabel("");
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b7.setLabel("");
			}
		}
		if (e.getSource() == b8) {
			String label = b8.getLabel();
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b8.setLabel("");
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b8.setLabel("");
			}
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b8.setLabel("");
			}
		}
		if (e.getSource() == b9) {
			String label = b9.getLabel();
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b9.setLabel("");
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b9.setLabel("");
			}
			if (b13.getLabel().equals("")) {
				b13.setLabel(label);
				b9.setLabel("");
			}
		}
		if (e.getSource() == b10) {
			String label = b10.getLabel();
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b10.setLabel("");
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b10.setLabel("");
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b10.setLabel("");
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b10.setLabel("");
			}
		}
		if (e.getSource() == b11) {
			String label = b11.getLabel();
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b11.setLabel("");
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b11.setLabel("");
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b11.setLabel("");
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b11.setLabel("");
			}
		}
		if (e.getSource() == b12) {
			String label = b12.getLabel();
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b12.setLabel("");
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b12.setLabel("");
			}
			if (b16.getLabel().equals("")) {
				b16.setLabel(label);
				b12.setLabel("");
			}
		}
		if (e.getSource() == b13) {
			String label = b13.getLabel();
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b13.setLabel("");
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b13.setLabel("");
			}
		}
		if (e.getSource() == b14) {
			String label = b14.getLabel();
			if (b13.getLabel().equals("")) {
				b13.setLabel(label);
				b14.setLabel("");
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b14.setLabel("");
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b14.setLabel("");
			}
		}
		if (e.getSource() == b15) {
			String label = b15.getLabel();
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b15.setLabel("");
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b15.setLabel("");
			}
			if (b16.getLabel().equals("")) {
				b16.setLabel(label);
				b15.setLabel("");
			}
		}
		if (e.getSource() == b16) {
			String label = b16.getLabel();
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b16.setLabel("");
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b16.setLabel("");
			}
		}
		if (e.getSource() == exit) {
			System.exit(0);
		}
		if (e.getSource() == cont) {
			new Puzzle();
		}

		if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3")
				&& b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6")
				&& b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9")
				&& b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12")
				&& b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15")
				&& b16.getLabel().equals("")) {
			JOptionPane.showMessageDialog(this, "Congratulations! You won.");
		}
	}

	public static String[] rand() {
		String[] s = new String[15];
		char[] ch = new char[15];
		String st = "123456789ABCDEF";
		String st1 = "";
		int dem = 0, n = 1;
		Random rand = new Random();
		while (dem != 15) {
			StringBuilder sb = new StringBuilder(1);
			n = rand.nextInt(st.length());
			ch[dem] = st.charAt(n);
			sb.append(st.charAt(rand.nextInt(st.length())));
			s[dem] = sb.toString();
			st = st.replace(s[dem], "");
			dem++;
		}
		for (int i = 0; i < ch.length; i++) {
			if (s[i].equals("A"))
				s[i] = "10";
			if (s[i].equals("B"))
				s[i] = "11";
			if (s[i].equals("C"))
				s[i] = "12";
			if (s[i].equals("D"))
				s[i] = "13";
			if (s[i].equals("E"))
				s[i] = "14";
			if (s[i].equals("F"))
				s[i] = "15";
		}
		return s;
	}

	public static void main(String[] args) {
		new Puzzle();
	}
}