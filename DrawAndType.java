package betterthanpaint;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DrawAndType extends Drawing implements KeyListener{
	private  FontMetrics fm;
	
	
	protected Font font = new Font("serif", Font.ITALIC, fontSize);
	

	public DrawAndType() {
		super();
		addKeyListener(this);
		
		// TODO Auto-generated constructor stub
	
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		myFont = new Font(fontType,style,fontSize);
		String s = String.valueOf(e.getKeyChar());
		Graphics g = getGraphics();
		g.setColor(justColor); 
		g.setFont(myFont);
		g.drawString(s, getLastX(), getLastY());
		fm = getFontMetrics(myFont);
		record(getLastX()+fm.stringWidth(s), getLastY());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
		// TODO Auto-generated method stub
		
	}


}
