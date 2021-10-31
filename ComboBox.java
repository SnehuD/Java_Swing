package Swing;

import javax.swing.*;

public class ComboBox
{

	public static void main(String[] args) 
	{
		JFrame a = new JFrame("Text field example");
		
		String subject[]= {"Java","OS","DS","Linux","Html"};
		JComboBox cb2 = new JComboBox(subject);
		cb2.setBounds(100,100,100,40);
		
		a.add(cb2);
		
		a.setSize(1000,1000);
		a.setLayout(null);
		a.setVisible(true);

	}

}
