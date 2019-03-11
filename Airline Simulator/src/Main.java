import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

	JPanel cardPanel;
	
	public Main(String title) {
		super(title);
		setBounds(100, 100, 800, 600);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    cardPanel = new JPanel();
	    CardLayout cl = new CardLayout();
	    cardPanel.setLayout(cl);
	    
		StartPanel panel1 = new StartPanel(this);   
		CentralPanel panel2 = new CentralPanel(this);
	   // GamePanel panel2 = new GamePanel();
	    
	    //addKeyListener(panel2.getKeyHandler());
	
	    cardPanel.add(panel1,"1");
	    cardPanel.add(panel2,"2");
	    
	    add(cardPanel);
	
	    setVisible(true);
	}

	public static void main(String[] args)
	{
		Main w = new Main("Airline Simulator");
	}
  
	public void changePanel(String name) {
		((CardLayout)cardPanel.getLayout()).show(cardPanel,name);
		requestFocus();
	}
  
}