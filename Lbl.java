package Swing;

import javax.swing.*;

public class Lbl
{

	public static void main(String[] args) 
	{
		JFrame a = new JFrame("Text field example");
		
		JLabel jl = new JLabel("Label...");
		jl.setBounds(130,130,200,40);
		
		a.add(jl);
		
		a.setSize(1000,1000);
		a.setLayout(null);
		a.setVisible(true);

	}

}

