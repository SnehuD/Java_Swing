package Swing;

import java.awt.*;
import javax.swing.*;

public class register extends JFrame
{

	private static JButton lgbtn,regbtn,hmbtn;

	private static JTextField cidtext;
	private static JLabel cidlabel;

	private static JTextField fnametext;
	private static JLabel fnamelabel;

	private static JTextField lnametext;
	private static JLabel lnamelabel;

	private static JTextField agetext;
	private static JLabel agelabel;

	private static JTextField emailtext;
	private static JLabel emaillabel;

	private static JTextField usertext;
	private static JLabel userlabel;

	private static JPasswordField passtext;
	private static JLabel passLabel;

	private static JLabel title,success;
	private static JPanel panel;
	private static JFrame frame;

	public register() 
	{
		panel = new JPanel();
		frame = new JFrame();

		frame.setSize(500, 600);
		frame.add(panel);
		panel.setLayout(new GridLayout(10,10,5,5));
		panel.setBackground(Color.orange);

		hmbtn = new JButton("Home");			
		panel.add(hmbtn);

		title = new JLabel("--- Registration Form ---");		
		panel.add(title);

		cidlabel= new JLabel("Customer ID");		
		panel.add(cidlabel);

		cidtext= new JTextField(20);		
		panel.add(cidtext);

		fnamelabel = new JLabel("First Name");		
		panel.add(fnamelabel);

		fnametext= new JTextField(20);		
		panel.add(fnametext);

		lnamelabel  = new JLabel("Last Name");		
		panel.add(lnamelabel);

		lnametext  = new JTextField(20);		
		panel.add(lnametext);

		agelabel = new JLabel("Customer Age");		
		panel.add(agelabel);

		agetext= new JTextField(20);		
		panel.add(agetext);

		emaillabel = new JLabel("Email ID");		
		panel.add(emaillabel);

		emailtext = new JTextField(20);		
		panel.add(emailtext);

		userlabel = new JLabel("Username");		
		panel.add(userlabel);

		usertext = new JTextField(20);		
		panel.add(usertext);

		passLabel= new JLabel("Password");		
		panel.add(passLabel);

		passtext = new JPasswordField(20);		
		panel.add(passtext);

		regbtn = new JButton("Register");		
		panel.add(regbtn);

		success = new JLabel("");		
		panel.add(success);

		title = new JLabel("Already Have an Account ?");		
		panel.add(title);

		lgbtn = new JButton("Login");		
		panel.add(lgbtn);
				
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		register rg = new register();
	}
}
