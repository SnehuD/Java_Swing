package Swing2;

import javax.swing.*;

public class TabbedPanelEg 
{
	JFrame f;
	TabbedPanelEg()
	{
		f = new JFrame();
		
		JTextArea ta = new JTextArea(250,250);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(50,50,200,200);
		
		tp.add("Home",p1);
		tp.add("Yahoo",p2);
		tp.add("Google",p3);
		
		f.add(tp);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new TabbedPanelEg();
	}

}
