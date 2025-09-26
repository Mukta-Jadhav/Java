package swing;
import java.awt.*;
import javax.swing.*;

public class panel extends JFrame{
	
	private JLabel jLabel1=new JLabel();
	private JLabel jLabel2=new JLabel();

	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	
	public panel() {
		
		try
		{
			jbInit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace( );
		}
	}
	
	private void jbInit() throws Exception{
		this.getContentPane( ).setLayout(null);
		this.setSize(new Dimension(400,300));
		jLabel1.setText("username");
		jLabel1.setBounds(new Rectangle(40,55,80,25));
		jLabel2.setText("Password");
		jLabel2.setBounds(new Rectangle(40,95,60,25));
		this.getContentPane( ).add(jLabel2,null);
		this.getContentPane( ).add(jLabel1,null);
	}
	

	public static void main(String[] args) {
	      panel p=new panel();
	      p.setTitle("Login");
	      p.setVisible(true);

	}

}
