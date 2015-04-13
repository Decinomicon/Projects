import java.io.File;
import java.util.*;
public class Boats {

	public static void main(String[] args) {
		String file= "boats";
		Scanner fileRead = null;
		try {
			fileRead = new Scanner(new File(file));
		} catch (Exception e) {
			System.out.println("Error loading file " + file);
			System.exit(0);
		}
		int r=0, x1=0, y1=0, d1=0, s1=0, x2=0, y2=0, d2=0, s2=0,xDist=0,yDist=0;
		while(fileRead.hasNextLine()){
			r=fileRead.nextInt();
			x1=fileRead.nextInt();
			y1=fileRead.nextInt();
			d1=fileRead.nextInt();
			s1=fileRead.nextInt();
			x2=fileRead.nextInt();
			y2=fileRead.nextInt();
			d2=fileRead.nextInt();
			s2=fileRead.nextInt();
		}
		boolean colision = false;
		int time=0;
		do{
			time++;
			if(d1==90){
				x1=x1+s1;
			}else if(d1==180){
				y1=y1-s1;
			}else if(d1==270){
				x1=x1-s1;
			}else if(d1==0){
				y1=y1+s1;
			}
			if(d2==90){
				x2=x2+s2;
			}else if(d2==180){
				y2=y2-s2;
			}else if(d2==270){
				x2=x2-s2;
			}else if(d2==0){
				y2=y2+s2;
			}
			if(x1>=x2){
				xDist=x1-x2;
			}else if(x2>=x1){
				xDist=x2-x1;
			}
			if(y1>=y2){
				yDist=y1-y2;
			}else if(y2>=y2){
				xDist=y2-y1;
			}
			if(xDist<=r&&yDist<=r){
				colision=true;
			}
			
		}while(colision==false);
		System.out.println("The colision will occure in "+time+" seconds");
	}

}
