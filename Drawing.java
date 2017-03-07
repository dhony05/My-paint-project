package betterthanpaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Drawing extends CentralJPanel implements MouseListener, MouseMotionListener {

	
		
		private int lastX =0, lastY =0;
		protected int times=0,size;
		
		
		
		public Drawing() {
		 
			super();
			setBackground(mainColor);
			addMouseListener(this);
			addMouseMotionListener(this);
		
		
		}
		
		
		@Override
		public void mousePressed(MouseEvent e){
			int x = e.getX();
			int y = e.getY();
			record(x,y);
			if(circlefilled){
				times++;
				record(e.getX(),e.getY());
			Graphics g = getGraphics();
			Graphics2D g2d = (Graphics2D)g;
			g2d.setColor(justColor);
			g2d.fillOval(lastX-(circleSize/2), lastY-(circleSize/2), circleSize, circleSize);
			
			
		}
			if(circle){
				times++;
				record(e.getX(),e.getY());
			Graphics g = getGraphics();
			Graphics2D g2d = (Graphics2D)g;
			g2d.setColor(justColor);
			g2d.drawOval(lastX-(circleSize/2), lastY-(circleSize/2), circleSize, circleSize);
			
			
		} 
			else if(squarefilled){
				times++;
				record(e.getX(),e.getY());
		
			
			Graphics g = getGraphics();
			Graphics2D g2d = (Graphics2D)g;
			g2d.setColor(justColor);
			g2d.fillRect(lastX-(circleSize/2), lastY-(circleSize/2), circleSize, circleSize);
			
			}
			else if(square){
				times++;
				record(e.getX(),e.getY());
			Graphics g = getGraphics();
			Graphics2D g2d = (Graphics2D)g;
			g2d.setColor(justColor);
			g2d.drawRect(lastX-(circleSize/2), lastY-(circleSize/2), circleSize, circleSize);
			
			}
			
			
		}
		/*public int setSizer(int r){
			return r = circleSize;
			
		} */
		
		public void actionPerformed1(ActionEvent e){
			
		

	}
			
		
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub	
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			requestFocus();
			record(e.getX(), e.getY());  
			
			
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			if(pen){
				int x = e.getX();
				int y = e.getY();
				Graphics g = getGraphics();
				Graphics g2d = (Graphics2D)g;			
				((Graphics2D) g2d).setStroke(new BasicStroke(circleSize));
				g2d.setColor(justColor);
				
				g2d.drawLine(lastX, lastY,x,y);
				record(x,y);
					
				
			}
			else if(eraser){
				int x = e.getX();
				int y = e.getY();
				Graphics g = getGraphics();
				Graphics g2d = (Graphics2D)g;
				
				((Graphics2D) g2d).setStroke(new BasicStroke(circleSize));
				
				g2d.setColor(Color.white);
				
				g2d.drawLine(lastX, lastY,x,y);
				record(x,y);
			}
			
			
			
			
			// TODO Auto-generated method stub
			
		}
		protected void record(int x, int y) {
			lastX = x;
			lastY = y;
			// TODO Auto-generated method stub
			
		}
		public int getLastX(){
			return lastX;
		}
		public int getLastY(){
			return lastY;
		}
		
		
		@Override
		public void mouseMoved(MouseEvent e) {
			record(e.getX(), e.getY()); // need for typig 
			
		}
		
		
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals(circleSizing)){
				 circleSize = (Integer.parseInt(circleSizing.getText()));
				 
				System.out.println(circleSize);
		}
			}


		 


}