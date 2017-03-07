package betterthanpaint;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;

public class WestJPanel extends CentralJPanel implements ActionListener  {

	
	
	public WestJPanel() {
		Object ini = new DrawAndType();
		
		//set the dimention for the panel
		this.setPreferredSize(new Dimension(100,140));
		setBackground(Color.gray);
		JLabel jl3 = new JLabel("Choose Sizes");
		add(jl3);

		
		GridBagConstraints layoutCon = new GridBagConstraints();

		layoutCon.insets = new Insets(5,5,5,5);
		
		shapeSize = new JLabel(" Shape ");
		add(shapeSize);
		circleSize = 10;
		// creating the text field for the circle size
        circleSizing = new JTextField(3);
        add(circleSizing);
        
        circleSizing.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
       			 	circleSize = Integer.parseInt(circleSizing.getText());
       			 
       			System.out.println(circleSize);
				}});
        
        textSize = new JLabel("     Font ");
		
		add(textSize);
		
	// create the text field for the  font 
		fontSizing = new JTextField(3);
		add(fontSizing);
    
		fontSizing.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)  {
			// TODO Auto-generated method stub
			
   			 	fontSize = Integer.parseInt(fontSizing.getText());
		
			
	
   			System.out.println("test");
		
		}});
		
		
        
        

		}
	public void rune() throws IOException{
		if ((fontSize)!= Integer.parseInt(fontSizing.getText())){
			
			throw new IOException("Only number Please");
			
		}
		else if  ((circleSize)!= Integer.parseInt(circleSizing.getText())){
			
			throw new IOException("Only number Please");
		
	}
	}
	
	public void actionPerformed(ActionEvent e)  {
			
			
	

}
		
}
