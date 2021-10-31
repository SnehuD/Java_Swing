package Swing;

import javax.swing.*;

public class Btn 
{

	public static void main(String[] args) 
	{
		JFrame a = new JFrame("Text field example");
		
		JButton b = new JButton("Im btn");
		b.setBounds(200,100,85,50);
		
		a.add(b);
		
		a.setSize(1000,1000);
		a.setLayout(null);
		a.setVisible(true);

	}

}
