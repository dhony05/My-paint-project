package betterthanpaint;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CentralJPanel extends JPanel {

	protected static int circleSize, fontSize;
	protected static boolean pen,eraser,circle,circlefilled,square,squarefilled,color;
	protected static JButton resetButton,shapesB,brush, penButton,colorButton, eraserButton,shapeButton,circleButton,circleFButton,squareButton,squareFButton;
	protected static Color justColor;
	protected static String g2d;
	protected static String fontType = "serif";
	protected int style = Font.ITALIC;
	protected final Color mainColor = Color.WHITE;
	//protected static JSlider slide;
	protected static Font myFont;
	protected static JLabel label,shapeSize,textSize;
	protected static JTextField circleSizing,fontSizing;

	
	public CentralJPanel() {
		// TODO Auto-generated constructor stub
	}


	public void actionPerformed(ActionEvent e) {
	
		// TODO Auto-generated method stub
		
	}

}
