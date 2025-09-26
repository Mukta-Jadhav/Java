package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PanelTest extends JFrame{
 
	    private JButton b,b1,b2,b3,b4,b5;
	    private JLabel l;
	    public PanelTest() {
	    	l=new JLabel("panel ");
	    	b=new JButton("button1");
	    	b1=new JButton("button2 ");
	    	b2=new JButton("button3");
	    	b3=new JButton("button 4 ");
	    	b4=new JButton("button5");
	    	b5=new JButton("button 6");
	    	
	    	JPanel p=new JPanel();
	    	
	    	p.add(b);
	    	p.add(b1);
	    	p.add(b2);
	    	p.add(b3);
	    	p.add(b4);
	    	p.add(b5);
	    	p.add(l);
	    	
	    	p.setBackground(Color.pink);
	    	add(p);
	    	setSize(300,300);
	    	show();
	    	
	    }
	    
	
	public static void main(String[] args) {
		PanelTest p=new PanelTest();
       // p.setLayout(new FlowLayout());
		// p.setLayout(new GridLayout(3,4));
		 // p.setLayout(new BorderLayout());
		// p.setLayout(new GridBagLayout());
		 p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
	}

}
