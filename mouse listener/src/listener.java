import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;


public class listener {

	public static void main(String[] args) {
		while(true){
			try {
				Thread.sleep(1000);
				PointerInfo a = MouseInfo.getPointerInfo();
				Point b = a.getLocation();
				int x = (int) b.getX();
				int y = (int) b.getY();
				System.out.println("x = "+x+" y = "+y);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
