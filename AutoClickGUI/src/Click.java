import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("unused")
public class Click {

	public static void main(String[] args) {
		while (true) {
			String clicks = JOptionPane
					.showInputDialog("Enter the number of clicks");
			if (clicks.equals("null")) {
				System.exit(0);
			}
			String time = JOptionPane
					.showInputDialog("Enter the speed(in milliseconds)");
			if (time.equals("null")) {
				System.exit(0);
			}
			String timer = JOptionPane
					.showInputDialog("How long until is starts(in seconds)");
			if (timer.equals("null")) {
				System.exit(0);
			}
			int clicknum = Integer.parseInt(clicks);
			int clicktime = Integer.parseInt(time);
			int clickstart = Integer.parseInt(timer);
			/*
			 * if(clicktime<100){ clicktime=100; }
			 */

			while (clickstart != 0) {
				try {
					Thread.sleep(1000);
					clickstart--;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Robot mouse = new Robot();
				for (int i = 0; i <= clicknum; i++) {
					try {

						PointerInfo a = MouseInfo.getPointerInfo();
						Point b = a.getLocation();
						int x = (int) b.getX();
						int y = (int) b.getY();
						int xlast = x, ylast = y;
						Thread.sleep(clicktime);
						PointerInfo q = MouseInfo.getPointerInfo();
						Point z = q.getLocation();
						x = (int) z.getX();
						y = (int) z.getY();
						int once = 0;
						while (xlast != x || ylast != y) {
							if (once == 0) {
								String cuntinue = JOptionPane
										.showInputDialog("Would you like to continue clicking 1)yes 2)no");
								if (cuntinue.equals(2)) {
									cuntinue = null;
								}
								if (cuntinue.equals(null)) {
									System.exit(0);
								}
								once++;
							}
							Thread.sleep(1000);
							PointerInfo o = MouseInfo.getPointerInfo();
							Point m = o.getLocation();
							x = (int) m.getX();
							y = (int) m.getY();
							xlast = x;
							ylast = y;
							Thread.sleep(1000);
							PointerInfo p = MouseInfo.getPointerInfo();
							Point e = p.getLocation();
							x = (int) e.getX();
							y = (int) e.getY();
						}

						mouse.mousePress(InputEvent.BUTTON1_MASK);
						mouse.mouseRelease(InputEvent.BUTTON1_MASK);

					} catch (InterruptedException e) {

					}
				}
			} catch (AWTException e) {

			}
		}

	}
}
