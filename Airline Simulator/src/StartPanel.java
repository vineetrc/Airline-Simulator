import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.io.File;


public class StartPanel extends JPanel implements ActionListener,MouseListener, KeyListener {
	
	private Main w;
	//private Image img = (new ImageIcon("redDemo.png")).getImage();
	private Image logo = (new ImageIcon("FinalLogo.jpg")).getImage();
	
	TextField text;

	
	public StartPanel(Main w) {
		this.w = w;
		
		JPanel p = new JPanel();
		
		p.setBackground(new Color(25,0,25,0));  // Panel is transparent
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));	
		p.add(Box.createVerticalStrut(300));   // Move down by 300 pixels  
		p.add(Box.createHorizontalStrut(200)); 
		
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(0,0,0,0));  // Panel is transparent
		
		p2.setLayout(new BoxLayout(p2,BoxLayout.X_AXIS));	
		
		 text = new TextField("Enter your Airline name over here!!!");
		p2.add(text);
		
		JButton button = new JButton("Start Game");
		button.addActionListener(this);
		
		JButton button2 = new JButton("Instructions");
		button2.addActionListener(this);
		
		//JButton button3 = new JButton("Player 2 Are You Ready");
		//button2.addActionListener(this);
		
		p2.add(button);
		p2.add(button2);
		//p2.add(button3);
		
		p.add(p2);
		add(p);
		
		this.requestFocusInWindow();
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		double ratioX = getWidth() / 800.0;
		double ratioY = getHeight() / 600.0;
		
		Graphics2D g2 = (Graphics2D)g;
		
		AffineTransform af = g2.getTransform();
		
		g2.scale(ratioX,ratioY);
		//g.drawImage(img,300,100,200,200, this);
		g.drawImage(logo, 270, 25 , 270 , 300, this);

		
		g2.setTransform(af);
		
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Instructions")){
		   w.changePanel("2");
		}
		else if(e.getActionCommand().equals("Start Game")) {
			String airline =text.getText();
			w.changePanel("2");
			System.out.println("start");
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