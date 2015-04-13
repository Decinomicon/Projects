import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Inventory {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String selection;
		int doWhat = 0;
		System.out.println("Game Inventory");
		while (true) {
			do {
				System.out.println("1) Add item to inventory");
				System.out.println("2) Look at inventory");
				System.out.println("3) Quit");
				selection = input.nextLine();
				try {
					doWhat = Integer.parseInt(selection);
				} catch (NumberFormatException ex) {

				}
				if (doWhat < 1 || doWhat > 3) {
					System.out.println("Invalid input, try again");
				}
			} while (doWhat < 1 || doWhat > 3);
			if (doWhat == 1) {
				add();
			} else if (doWhat == 2) {
				look();
			} else if (doWhat == 3) {
				System.out.println("Bye!");
				System.exit(0);
			}
		}
	}

	static void add() {
		Scanner input = new Scanner(System.in);
		int cost = 0, amount = 0;
		String cost1, amount1, itemName;
		String file = "gameinventory.txt";
		PrintWriter File = null;
		System.out.println("What is the items name");
		itemName = input.nextLine();
		do {
			System.out.println("What is the items price");
			cost1 = input.nextLine();
			try {
				cost = Integer.parseInt(cost1);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input, try again");
			}
			if (cost <= 0) {
				System.out.println("Nothing is free");
			}
		} while (cost <= 0);
		do {
			System.out.println("How many do you have");
			amount1 = input.nextLine();
			try {
				amount = Integer.parseInt(amount1);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input, try again");
			}
			if (amount <= 0) {
				System.out.println("You can't have zero");
			}
		} while (amount <= 0);

		try {
			File = new PrintWriter(new FileWriter(file, true));
		} catch (Exception a) {
			System.out.println("ERROR LOADING FILE " + file);
			System.exit(0);
		}
		File.println(itemName);
		File.println(cost);
		File.println(amount);
		File.close();
		System.out.println("Item saved to invetory");
	}

	static void look() {
		Scanner Load = null;
		String file = "gameinventory.txt", itemName, cost, amount;
		try {
			Load = new Scanner(new File(file));
		} catch (Exception e) {
			System.out.println("Error loading file " + file);
			System.exit(0);
		}
		System.out.println("Item     Cost     Amount");
		while (Load.hasNextLine()) {
			itemName = Load.nextLine();
			cost = Load.nextLine();
			amount = Load.nextLine();
			System.out.println(itemName + "     " + cost + "     " + amount);
		}

	}

}
