package Swing;

import javax.swing.*;

public class CheckBox
{

	public static void main(String[] args) 
	{
		JFrame a = new JFrame("Text field example");
		
		JCheckBox cb = new JCheckBox("IMG");
		cb.setBounds(100,100,50,50);
		
		JCheckBox cb1 = new JCheckBox("Java",true);
		cb1.setBounds(100,130,80,60);
		
		a.add(cb);
		a.add(cb1);
		
		a.setSize(1000,1000);
		a.setLayout(null);
		a.setVisible(true);

	}

}
