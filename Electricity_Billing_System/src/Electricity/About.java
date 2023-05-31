package Electricity;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{
	JButton b1;
	JLabel l1;
	Font f, f1, f2;
	TextArea t1;
	String s;
	
	public About() {
		setLayout(null);
		JButton b1 = new JButton("Exit");
		add(b1);
		b1.setBounds(180, 430, 120, 130);
		b1.addActionListener(this);
		
		Font f = new Font("RALEWAY", Font.BOLD, 180);
		setFont(f);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
