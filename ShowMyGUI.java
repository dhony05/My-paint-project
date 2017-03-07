package betterthanpaint;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


import circledrawingexample.CircleDrawer1;

public class ShowMyGUI extends JFrame implements ActionListener
{
	public static DrawAndType cr; // instanciate the variable 
	JButton brushBut, color,resetButton;
	public ShowMyGUI()
	{
		JPanel mainContent = new JPanel();
		mainContent.setLayout(new BorderLayout());
		NorthJPanel north = new NorthJPanel();
		SouthJPanel south = new SouthJPanel();
		WestJPanel west = new WestJPanel();
		EastJPanel east = new EastJPanel();
		//Drawing cr = new Drawing();
		cr = new DrawAndType();
		
		
		
		resetButton = new JButton();
		resetButton.setActionCommand("reset");
		Icon butIconr = new ImageIcon("./src/img/reset.png");
		resetButton.setIcon(butIconr);
		resetButton.setBackground(Color.white);
		resetButton.addActionListener(this);
		
		
		//resetButton.setLayout(null);
	    resetButton.setBounds(40,100,100,60);
		west.add(resetButton);
		
		mainContent.add(BorderLayout.NORTH, north);
		mainContent.add(BorderLayout.SOUTH,south);
		mainContent.add(BorderLayout.WEST, west);
		mainContent.add(BorderLayout.EAST, east);
		mainContent.add(BorderLayout.CENTER, cr);
		
		
		

		
		add(mainContent);
		
		setTitle("My Frame");
		setSize(1500,1500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		setResizable(false);
		
		
		
	}
	
	public static void main(String[] args)
	{
		
		new ShowMyGUI();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object west = e.getSource();
		if(west == resetButton){
			cr.repaint();
			System.out.print("test");
		}
		
	}

	
		
}

