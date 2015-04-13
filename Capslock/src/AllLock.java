import java.awt.*;
import java.awt.event.*;
public class AllLock {

	public static void main(String[] args) {
		try {
			Robot robot=new Robot();
		while(true){
			try {
				Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_CAPS_LOCK);
			robot.keyPress(KeyEvent.VK_CAPS_LOCK);
			robot.keyPress(KeyEvent.VK_NUM_LOCK);
			robot.keyRelease(KeyEvent.VK_NUM_LOCK);
			robot.keyPress(KeyEvent.VK_SCROLL_LOCK);
			robot.keyPress(KeyEvent.VK_SCROLL_LOCK);
			robot.keyPress(KeyEvent.VK_TAB);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
