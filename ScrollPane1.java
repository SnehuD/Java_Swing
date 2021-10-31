package Swing2;

import javax.swing.*;

public class ScrollPane1 
{

	public static void main(String[] args) 
	{
		JFrame a = new JFrame("Swing Example");
		JButton b = new JButton("Click");
		b.setBounds(100,100,85,30);
		a.add(b);
		
		String column[]= {"Serial_No","Enroll_No","Name","Class"};
		
		String data[][]= 
			{
				{
					"1","1907007","Shamal","TYIT"
				},
				{
					"1","1907011","Snehal","TYIT"
				},
				{
					"1","1907021","Sneha","TYIT"
				},
				{
					"1","1907024","Sakshi","TYIT"
				}
			
			};
		
		JTable jt = new JTable(data,column);
		
		jt.setBounds(30,400,200,300);
		JScrollPane sp = new JScrollPane(jt);
		
		a.add(sp);
		
		a.setSize(300,300);
		a.setVisible(true);
		
	}

}
