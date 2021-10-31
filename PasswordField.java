package Swing;

import javax.swing.*;

public class PasswordField
{

	public static void main(String[] args) 
	{
		JFrame a = new JFrame("Text field example");
		
		JPasswordField pwd = new JPasswordField();
		JLabel l1 = new JLabel("Password");
		l1.setBounds(20,150,80,30);
		pwd.setBounds(100,150,100,30);
		
		a.add(l1);
		a.add(pwd);
		
		a.setSize(1000,1000);
		a.setLayout(null);
		a.setVisible(true);

	}

}
