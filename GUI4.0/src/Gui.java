import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Gui extends JFrame{
	private JButton reg;
	private JButton custom;
	
	public Gui(){
		super("You are here");
		setLayout (new FlowLayout());
		
		reg = new JButton("Reg Button");
		add(reg);
		
		Icon s = new ImageIcon(getClass().getResource("Smiley.png"));
		Icon a = new ImageIcon(getClass().getResource("angry.png"));
		custom = new JButton("Custom", s);
		custom.setRolloverIcon(a);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	}
	
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null,  String.format("%s", event.getActionCommand()));
		}
		
	}
}
