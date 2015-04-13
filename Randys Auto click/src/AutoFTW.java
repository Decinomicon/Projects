import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class AutoFTW {
	static int clicks=0;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true){
		clicks=0;
			while(clicks==0){
			System.out.println("Enter click speed in Millseconds(1000 = 1 second)");
			String timer=input.nextLine();
			try{
				clicks= Integer.parseInt(timer);
				/*if(clicks<100){
					clicks=100;
				}*/
			}catch(NumberFormatException ex){
				System.out.println("NO");
			}
			System.out.println("How may clicks would you like?");
			String times=input.nextLine();
			int timesT=0;
			while(timesT==0){
			try{
				timesT= Integer.parseInt(times);
			}catch(NumberFormatException ex){
				
			}
			}
			System.out.println("How long untill is starts(in seconds)");
			String wait=input.nextLine();
			int waitT=0;
			while(waitT==0){
				try{
					waitT= Integer.parseInt(wait);
				}catch(NumberFormatException ex){
					
				}
			}
			int countdown=waitT;
			while(countdown!=0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				countdown--;
				System.out.println(countdown);
			}
			
			System.out.println("GO!!");
			
				try {
					Robot mouse=new Robot();
					for(int i=0; i<=timesT;i++){
						try {
							Thread.sleep(clicks);
							 System.out.println("Clicks: "+i);
							mouse.mousePress(InputEvent.BUTTON1_MASK);
				            mouse.mouseRelease(InputEvent.BUTTON1_MASK);
				           
						} catch (InterruptedException e) {
						
						}
					}
				} catch (AWTException e) {
					
				}
			System.out.println("Its done");
		}

	}
	}

}
