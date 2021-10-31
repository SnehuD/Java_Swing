package Swing;

import javax.swing.*;

public class RadioBtn
{

	public static void main(String[] args) 
	{
		JFrame a = new JFrame("Text field example");
		
		JRadioButton r1 = new JRadioButton("Male");
		JRadioButton r2 = new JRadioButton("Female",true);
		r1.setBounds(100,100,100,30);
		r2.setBounds(100,130,100,30);
		
		a.add(r1);
		a.add(r2);
		
		a.setSize(1000,1000);
		a.setLayout(null);
		a.setVisible(true);

	}

}
