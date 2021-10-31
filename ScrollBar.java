package Swing;

import javax.swing.*;

public class ScrollBar
{

	public static void main(String[] args) 
	{
		JFrame a = new JFrame("Text field example");
		
		JScrollBar s = new JScrollBar();
		s.setBounds(100,150,100,100);
		
		a.add(s);
		
		a.setSize(1000,1000);
		a.setLayout(null);
		a.setVisible(true);

	}

}
