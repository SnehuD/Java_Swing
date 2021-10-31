package Swing2;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeEg 
{
	JFrame f;
	TreeEg()
	{
		f = new JFrame();
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");

		DefaultMutableTreeNode A = new DefaultMutableTreeNode("A");
		DefaultMutableTreeNode B = new DefaultMutableTreeNode("B");
		
		DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("A1");
		DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("A2");
		
		A.add(A1);
		A.add(A2);
		
		rootNode.add(A);
		rootNode.add(B);
		
		JTree tree = new JTree(rootNode);
		
		f.add(tree);
		
		f.setSize(200,200);
		f.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new TreeEg();
	}

}
