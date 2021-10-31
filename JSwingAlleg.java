package Swing;

import javax.swing.*;

public class JSwingAlleg
{

	public static void main(String[] args) 
	{
		JFrame a = new JFrame("Text field example");
		
		JButton b = new JButton("Click");
		b.setBounds(50,50,85,30);
		
		JLabel jl = new JLabel("Hello");
		jl.setBounds(50,150,200,40);
		
		JTextField tf = new JTextField("Welcome to GPP");
		tf.setBounds(50,100,200,40);
		
		JTextArea ta = new JTextArea("Welcome to TYIT");
		ta.setBounds(50,200,100,100);
		
		JPasswordField pwd = new JPasswordField();
		JLabel l1 = new JLabel("Password");
		l1.setBounds(20,350,80,30);
		pwd.setBounds(100,350,100,30);
		
		JCheckBox cb = new JCheckBox("IMG");
		cb.setBounds(100,400,50,50);
		
		JCheckBox cb1 = new JCheckBox("Java",true);
		cb1.setBounds(100,430,80,60);
		
		JRadioButton r1 = new JRadioButton("Male");
		JRadioButton r2 = new JRadioButton("Female",true);
		r1.setBounds(100,480,100,30);
		r2.setBounds(100,500,100,30);
		
		JScrollBar s = new JScrollBar();
		s.setBounds(100,550,100,100);
		
		String subject[]= {"Java","OS","DS","Linux","Html"};
		JComboBox cb2 = new JComboBox(subject);
		cb2.setBounds(100,600,100,40);
		
		
		a.add(b);
		a.add(jl);
		a.add(tf);
		a.add(ta);
		a.add(l1);
		a.add(pwd);
		a.add(cb);
		a.add(cb1);
		a.add(r1);
		a.add(r2);
		a.add(s);
		a.add(cb2);
		
		
		
		a.setSize(1000,1000);
		a.setLayout(null);
		a.setVisible(true);

	}

}
