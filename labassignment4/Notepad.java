package labassignment4;

import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener.*;
//

public class Notepad extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		new Notepad();
		
      }
	public Notepad()
	{
		super("Notepad");
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		
		
		JMenu menu=new JMenu("files");
		JMenu menu1=new JMenu("Edit");
		
		menu1.add(makeMenuItem("Cut"));
		menu1.add(makeMenuItem("Copy"));
		menu1.add(makeMenuItem("Paste"));
		menu1.add(makeMenuItem("Select All"));
		
		JMenu menu2=new JMenu("Help");
		JMenuBar menubar=new JMenuBar();
		menubar.add(menu);
		menubar.add(menu1);
		menubar.add(menu2);
		setJMenuBar(menubar);
		setSize(300,300);
		setLocation(200,200);
		setVisible(true);
		
		
	}	
	
	 public void actionPerformed(ActionEvent e) {
		 String command=e.getActionCommand();
		// if (command.equals());
		 
		 
	 }
		private JMenuItem makeMenuItem(String name)
		{
			JMenuItem m=new JMenuItem(name);
			m.addActionListener(this);
			return m;
			
		}
	
		
		
		
		
	}


