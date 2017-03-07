package betterthanpaint;

import java.awt.BasicStroke;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EastJPanel extends CentralJPanel implements ActionListener,ItemListener{

	private int lastX = 0, lastY =0;
	private JButton colorButton;

	private JButton penColorButton;
	public EastJPanel() {
		
		
		this.setPreferredSize(new Dimension(100,100));
		//this.setBackground(Color.green);
		//setLayout(new GridLayout(1,1));
		JLabel jl4 = new JLabel("Tools");
		add(jl4); 
		//adding the bolean values to the JButtons 
		//adding the image to the JButtons 
		pen =true;
		circle =false;
		square = false;
		circlefilled = false;
		squarefilled = false;
		eraser = false;
		
		//color = false;
		//brush 
		penButton = new JButton();
		penButton.setActionCommand("pen");
		Icon butIcon1 = new ImageIcon("./src/img/paint-brush.png");
		penButton.setIcon(butIcon1);
		penButton.addActionListener(this);
		
		eraserButton =new JButton();
		eraserButton.setActionCommand("eraser");
		Icon butIcon2 = new ImageIcon("./src/img/eraser.png");
		eraserButton.setIcon(butIcon2);
		eraserButton.addActionListener(this);
		
		circleButton = new JButton();
		circleButton.setActionCommand("circle");
		Icon butIcon3 = new ImageIcon("./src/img/oval.png");
		circleButton.setIcon(butIcon3);
		circleButton.addActionListener(this);
		
		circleFButton = new JButton();
		circleFButton.setActionCommand("circlef");
		Icon butIcon3f = new ImageIcon("./src/img/ovalfilled.png");
		circleFButton.setIcon(butIcon3f);
		circleFButton.addActionListener(this);
		
		
		squareButton = new JButton();
		squareButton.setActionCommand("square");
		Icon butIcon4 = new ImageIcon("./src/img/square.png");
		squareButton.setIcon(butIcon4);
		squareButton.addActionListener(this);
		
		squareFButton = new JButton();
		squareFButton.setActionCommand("squaref");
		Icon butIcon4F = new ImageIcon("./src/img/squarefilled.png");
		squareFButton.setIcon(butIcon4F);
		squareFButton.addActionListener(this);
		
		justColor = Color.BLUE;
		penColorButton = new JButton();
		penColorButton.setActionCommand("color");
		Icon butIcon5 = new ImageIcon("./src/img/color.png");
		penColorButton.setIcon(butIcon5);
		penColorButton.addActionListener(this);
		
		label = new JLabel();
		label.setText("Shapes");
		
		Box box = Box.createVerticalBox();
		box.add(penButton);
		box.add(penColorButton);box.add(eraserButton);
		add(box);
		Box box2 = Box.createHorizontalBox();
		add(label);
		box2.add(circleButton);	box2.add(squareButton);
		add(box2);
		Box box3 = Box.createHorizontalBox();
		box3.add(circleFButton);	box3.add(squareFButton);
		add(box3);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "pen"){
			pen = true;			
			eraser = false;
			circle = false;
			circlefilled = false;
			square = false;
			squarefilled = false;
			
			
		}
		else if (e.getActionCommand() == "circle" ){
		
			pen = false;
			eraser = false;
			circle = true;
			circlefilled = false;
			square = false;
			squarefilled = false;
		}
		else if (e.getActionCommand() == "circlef" ){
			
			pen = false;
			eraser = false;
			circle = false;
			circlefilled = true;
			square = false;
			squarefilled = false;
		}
		else if (e.getActionCommand() == "eraser" ){
			//penButton.setBackground(Color.white);
			//eraserButton.setBackground(Color.blue);
			//shapeButton.setBackground(Color.white);
			
			pen = false;
			eraser = true;
			circle = false;
			circlefilled = false;
			square = false;
			squarefilled = false;
		}
		
		else if (e.getActionCommand() == "square"){
			
			pen = false;
			eraser = false;
			circle = false;
			circlefilled = false;
			square = true;
			squarefilled = false;
		
		}  
	else if (e.getActionCommand() == "squaref"){
			
			pen = false;
			eraser = false;
			circle = false;
			circlefilled = false;
			square = false;
			squarefilled = true;
		
		}  
		else if(e.getSource() ==  penColorButton) {
			if(pen || circle || square || eraser ||circlefilled || squarefilled ){
		//adding color to pen or anything
			Color brushColor = JColorChooser.showDialog(this,"Pick a color",
					mainColor);
			if(penColorButton.getBackground() != null){
				penColorButton.setBackground(brushColor);
				justColor = brushColor  ;
			}
		}}
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}