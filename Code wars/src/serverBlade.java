import java.io.File;
import java.io.PrintWriter;
import java.util.*;
public class serverBlade {

	public static void main(String[] args) {
		String fileIn="runData", fileOut="log";
		PrintWriter outputStream=null;
		Scanner load = null;
		try {
			load = new Scanner(new File(fileIn));
		} catch (Exception e) {
			System.out.println("Error loading file " + fileIn);
			System.exit(0);
		}
		try {
			outputStream = new PrintWriter(fileOut);
		} catch (Exception e) {
			System.out.println("Well you see, there was a problem");
			System.exit(0);
		}
		String header[] = {}, datehold[]={}, holdeer[]={};
		ArrayList<String> fans = new ArrayList<>();
		header = new String[3];
		datehold = new String[3];
		holdeer = new String[3];
		String holder = "";
		holder = load.nextLine();
		header = holder.split(",");
		double cost = Double.parseDouble(header[2]);
		String date = header[0];
		datehold = date.split("/");
		if(datehold[0].equals("01")){
			datehold[0]="January";
		}else if(datehold[0].equals("02")){
			datehold[0]="February";
		}else if(datehold[0].equals("03")){
			datehold[0]="March";
		}else if(datehold[0].equals("04")){
			datehold[0]="April";
		}else if(datehold[0].equals("05")){
			datehold[0]="May";
		}else if(datehold[0].equals("06")){
			datehold[0]="June";
		}else if(datehold[0].equals("07")){
			datehold[0]="July";
		}else if(datehold[0].equals("08")){
			datehold[0]="August";
		}else if(datehold[0].equals("09")){
			datehold[0]="September";
		}else if(datehold[0].equals("10")){
			datehold[0]="October";
		}else if(datehold[0].equals("11")){
			datehold[0]="November";
		}else if(datehold[0].equals("12")){
			datehold[0]="December";
		}
		holdeer = new String[4];
		holder = load.nextLine();
		holdeer = holder.split(",");
		double OFF=Double.parseDouble(holdeer[0]), SLEEP=Double.parseDouble(holdeer[1]), LOW=Double.parseDouble(holdeer[2]), FULL=Double.parseDouble(holdeer[3]);
			while(load.hasNextLine()){
				fans.add(load.nextLine());
			}
			
		for(int i = 0; i < fans.size(); i++){
			System.out.println(fans.get(i));

		}
			
			
			
			
			
			
			
		
		

	
	}

}
