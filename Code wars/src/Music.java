import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class Music {

	public static void main(String[] args) {
		String fileIn = "musicIn";
		String fileOut = "musicOut";
		PrintWriter outputStream = null;
		Scanner Load = null;
		String key = "", tone = "";
		String major[] = { "C", "C#", "Db", "D", "D#", "Eb", "E", "F", "F#",
				"Gb", "G", "G#", "Ab", "A", "A#", "Bb", "B", "C", "C#", "Db", "D", "D#", "Eb", "E", "F", "F#",
				"Gb", "G", "G#", "Ab", "A", "A#", "Bb", "B"};

		try {
			Load = new Scanner(new File(fileIn));
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
		while (Load.hasNextLine()) {
			int num = 0, numCont = 0;
			boolean start = false;
			key = Load.nextLine();
			tone = Load.nextLine();
			if (tone.equals("major")) {
				do {

					if (major[num].equals(key)) {
						numCont = num;
						start = true;
					}
					num++;
				} while (start == false);
				outputStream.print(key + "-");
				numCont = numCont + 4;
				outputStream.print(major[numCont] + "-");
				numCont = numCont + 3;
				outputStream.print(major[numCont]);
				outputStream.println("");
			} else if (tone.equals("minor")) {
				
				do {

					if (major[num].equals(key)) {
						numCont = num;
						start = true;
					}
					num++;
				} while (start == false);
				outputStream.print(key + "-");
				numCont = numCont + 3;
				outputStream.print(major[numCont] + "-");
				numCont = numCont + 4;
				outputStream.print(major[numCont]);
				outputStream.println("");
			}
		}
		outputStream.close();

	}

}
