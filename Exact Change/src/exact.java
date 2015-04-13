import java.util.Scanner;
import java.io.File;

public class exact {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int price=0, twenty=0, ten=0, five=0, one=0, totBills = 0;
		String file = "input.txt";
		Scanner File = null;
		try {
			File = new Scanner(new File(file));
		} catch (Exception e) {
			System.out.println("Error loading file " + file);
			System.exit(0);
		}
		while(File.hasNextLine()){
			price = File.nextInt();
			twenty = File.nextInt();
			ten = File.nextInt();
			five = File.nextInt();
			one = File.nextInt();
		/*System.out.println("What is the price?");
		price = input.nextInt();
		System.out.println("How many twenties do you have?");
		twenty = input.nextInt();
		System.out.println("How many tens do you have?");
		ten = input.nextInt();
		System.out.println("How many fives do you have?");
		five = input.nextInt();
		System.out.println("How many ones do you have?");
		one = input.nextInt();*/
		boolean c = false;
		totBills = (twenty * 20) + (ten * 10) + (five * 5) + (one * 1);
		while(c == false) {
			if (price <= totBills - 20 && twenty > 0) {
				totBills = totBills - 20;
				twenty--;
			} else if (price <= totBills - 10 && ten > 0) {
				totBills = totBills - 10;
				ten--;
			} else if (price <= totBills - 5 && five > 0) {
				totBills = totBills - 5;
				five--;

			} else if (price <= totBills - 1 && one > 0) {
				totBills = totBills - 1;
				one--;
			} else {
				c = true;
			}
		}
		System.out.println(totBills);
		}
		

	}

}
