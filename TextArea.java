package Swing;

import javax.swing.*;

public class TextArea
{

	public static void main(String[] args) 
	{
		JFrame a = new JFrame("Text field example");
		
		JTextArea ta = new JTextArea("Welcome to TYIT");
		ta.setBounds(50,200,100,100);
		
		a.add(ta);
		
		a.setSize(1000,1000);
		a.setLayout(null);
		a.setVisible(true);

	}

}
