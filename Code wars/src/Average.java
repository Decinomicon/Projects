import java.io.File;
import java.util.*;

public class Average {

	public static void main(String[] args) {
		String fileIn = "grade";
		Scanner Load = null;
		String words = "";
		String funStuff[]={};
		double[] homeGrades={};
		double[] testGrades={};
		testGrades= new double[5];
		homeGrades=new double[11];
		
		funStuff = new String[20];
		try {
			Load = new Scanner(new File(fileIn));
		} catch (Exception e) {
			System.out.println("Error loading file " + fileIn);
			System.exit(0);
		}
		while(Load.hasNextLine()){
			double homeTot=0,homeAve=0,homePer=0,testTot=0,testAve=0,testPer=0,Ave=0,absolute=0;
			String holder="";
			int counter=0,posSave=0;
			double numStore=0,currentLow=100;
			words = Load.nextLine();
			funStuff=words.split(" ");
			for(int i = 3; i<=13;i++){
			holder=funStuff[i];
			homeGrades[counter]=Double.parseDouble(holder);
			counter++;
			}
			for(int i = 0; i<homeGrades.length;i++){
				numStore=homeGrades[i];
				if(numStore<100&&currentLow==100){
					currentLow=numStore;
					posSave=i;
				}
				if(numStore<currentLow){
					currentLow=numStore;
					posSave=i;
				}
			}
			homeGrades[posSave]=0;
			counter=0;
			for(int i = 15;i<20;i++){
				holder=funStuff[i];
				testGrades[counter]=Double.parseDouble(holder);
			
				counter++;
			}
			
			for(int i=0; i<homeGrades.length;i++){
				homeTot=homeTot+homeGrades[i];
			}
			homeAve=homeTot/(homeGrades.length-1);
			for(int i=0; i<testGrades.length;i++){
				testTot=testTot+testGrades[i];
			}
			testAve=testTot/testGrades.length;
			homePer=homeAve*.4;
			testPer=testAve*.6;
			Ave=homePer+testPer;
			absolute = (double)Math.round(Ave*10)/10;
			System.out.println(funStuff[0]+" "+funStuff[1]+" "+absolute);
		}
	}
}
