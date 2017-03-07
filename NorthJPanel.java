package betterthanpaint;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NorthJPanel extends CentralJPanel implements ActionListener {

	public NorthJPanel() {

		this.setBackground(Color.gray);
		JLabel jl1 = new JLabel("Project Paint");
		add(jl1);
		
		}

	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			// TODO Auto-generated method stub
			
		}
		

	}