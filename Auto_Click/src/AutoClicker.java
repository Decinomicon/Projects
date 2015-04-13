import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AutoClicker {
	public static int rate = 0;
	public static void main(String[] args) {
	  try {
		Robot robot=new Robot();
	for(int i=0; i<12;i++){
		try {
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_SHIFT);
		    robot.keyRelease(KeyEvent.VK_SHIFT);
			System.out.println("hi");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	} catch (AWTException e) {
		
		e.printStackTrace();
	}
		
}
}
