import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TheClass {

	public static void main(String[] args) {
		String name, yn, miles;
		String file = "input.txt";
		Scanner File = null;
		try {
			File = new Scanner(new File(file));
		} catch (Exception e) {
			System.out.println("Error loading file " + file);
			System.exit(0);
		}
		while (File.hasNextLine()) {
			name=File.nextLine();
			yn=File.nextLine();
			miles=File.nextLine();
			System.out.println(name+" lives "+miles+" miles away");
			if(yn.equals("yes")){
				System.out.println(name +" is coming to the party");
			}
			else if(yn.equals("no")){
				System.out.println(name +" is not coming to the party");
			}
			System.out.println(" ");
			
		}

	}

}
