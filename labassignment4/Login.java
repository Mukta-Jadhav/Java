package labassignment4;

import java.awt.*;
import javax.swing.*;


public class Login  extends JFrame{
	
	public Login() {
		Container con=getContentPane();
		con.setLayout(new GridLayout(0,1));
		JLabel j1=new JLabel("UserName :");
		con.add(j1);
		JTextField tf1=new JTextField(40);
		con.add(tf1);
		
		System.out.println("\n");
		JLabel j2=new JLabel("Password :");
		con.add(j2);
		JTextField tf2=new JTextField(40);
		con.add(tf2);
		setSize(600,600);
		setVisible(true);
				
	}

	public static void main(String[] args) {
		new Login();

	}

}
