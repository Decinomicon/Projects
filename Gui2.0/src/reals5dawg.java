import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class reals5dawg extends JFrame{
	private JLabel item1;
	
	public reals5dawg(){
		super("Her i am dawg");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("Wud up Dawg");
		item1.setToolTipText("Naw dog im not ghetto");
		add(item1);
		
		
	}

}
