import java.io.*;
import java.util.Scanner;

public class PallendromesFTW {

	public static void main(String[] args) {
		String file = "input.txt";
		PrintWriter out = null;
		String outFile = "output.txt";
		int num = 0, num2 = 0, reversed = 0;
		Scanner File = null;
		try {
			File = new Scanner(new File(file));
		} catch (Exception e) {
			System.out.println("Error loading file " + file);
			System.exit(0);
		}
		while (File.hasNextLine()) {
			num = File.nextInt();
			 for (int i = 1; i < 3; i++) {
			num2 = num;
			if (num != 0) {
				while (num != 0) {

					reversed = reversed * 10;
					reversed = reversed + num % 10;
					num = num / 10;

				}
			}
			num = reversed;

			 }
			boolean paradox;
			int reversey = 0, num3 = num;
			if (num != 0) {
				while (num != 0) {
					reversey = reversey * 10;
					reversey = reversey + num % 10;
					num = num / 10;
				}
			}
			if (num3 == reversey) {
				paradox = true;
			} else {
				paradox = false;
			}

			
			try {
				out = new PrintWriter(new FileWriter(outFile, true));
			} catch (Exception e) {
				System.out.println("Uhhh oooh");
				System.exit(0);
			}
			out.println(paradox);
			out.close();
		}
		
	}

}
