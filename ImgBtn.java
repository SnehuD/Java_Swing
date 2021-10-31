package Swing;

import javax.swing.*; 

public class ImgBtn
{    
	ImgBtn()
	{    
		JFrame f=new JFrame("Button With Image");   
		
		JButton b=new JButton(new ImageIcon("S:\\barbie4.png.jpeg"));    
		b.setBounds(100,100,500,500);  
		
		f.add(b);    
		
		f.setSize(1000,1000);    
		f.setLayout(null);    
		f.setVisible(true);        
    }         

	public static void main(String[] args) 
	{    
		new ImgBtn();    
	}
	
}    