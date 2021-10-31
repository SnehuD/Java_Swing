package Swing;

import javax.swing.*;

public class TextField
{

	public static void main(String[] args) 
	{
		JFrame a = new JFrame("Text field example");
		
		JTextField tf = new JTextField("Welcome to GPP");
		tf.setBounds(50,100,200,40);
		
		a.add(tf);
		
		a.setSize(1000,1000);
		a.setLayout(null);
		a.setVisible(true);

	}

}

