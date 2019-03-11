import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class CentralPanel extends JPanel implements ActionListener,MouseListener, KeyListener {

	
	private Main w;
	//private Image img = (new ImageIcon("redDemo.png")).getImage();
	private Image logo = (new ImageIcon("FinalLogo.jpg")).getImage();
	
	TextField text;

	
	public CentralPanel(Main w)  {
	      

	        JLabel text = new JLabel("Air");
	        
	        add(text);

	         JPanel panel = new JPanel ( new GridLayout ( 20, 1 ) );
	        for ( int i = 0; i < 5; i++ )
	        {
	            panel.add ( new JButton ( "button" + i ) );
	        }
	        final JScrollPane scroll = new JScrollPane ( panel );
	        
	     
	        
	        
	        scroll.setPreferredSize ( new Dimension ( 300, 300 ) );
	        add(scroll);

	        

	       
	    }

	    
		
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Instructions")){
		   w.changePanel("3");
		}
		else if(e.getActionCommand().equals("Start Game")) {
			String airline =text.getText();
			w.changePanel("2");
		}
		else {
			
			w.changePanel("2");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
	
