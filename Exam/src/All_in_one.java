import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.Random;

public class All_in_one {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menu = 0, forever = 0;
		do {
			do {
				System.out.println("What would you like to do?");
				System.out.println("1. Basic Calculator");
				System.out.println("2. Random number gen");
				System.out.println("3. Random math problem");
				System.out.println("4. Letter Replacer");
				menu = input.nextInt();
				switch (menu) {
				case 1:
					basicCalc();// goes to basicCalc
					break;
				case 2:
					random();// goes to random
					break;
				case 3:
					math();// goes to math
					break;
				case 4:
					replace();// goes to replace
					break;
				}
			} while (menu > 4 || menu < 1);
		} while (forever == 0);
	}

	static void basicCalc() {
		Scanner input = new Scanner(System.in);
		int num1, num2, tot, again = 0, choice, cont;
		System.out.println("Enter two numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println("What would you like to do with these?");
		System.out.println("1. add");
		System.out.println("2. subtract");
		System.out.println("3. multiply");
		System.out.println("4. divide");
		System.out.println("5. return to main menu");
		choice = input.nextInt();// from input determines what operator to use
		if (choice == 1) {
			tot = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + tot);
			System.out.println("enter any number to continue");
			cont = input.nextInt();
			if (cont == 1) {
			} else {
			}
		} else if (choice == 2) {
			tot = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + tot);
			System.out.println("enter any number to continue");
			cont = input.nextInt();
			if (cont == 1) {
			} else {
			}
		} else if (choice == 3) {
			tot = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + tot);
			System.out.println("enter any number to continue");
			cont = input.nextInt();
			if (cont == 1) {
			} else {
			}
		} else if (choice == 4) {
			tot = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + tot);
			System.out.println("enter any number to continue");
			cont = input.nextInt();
			if (cont == 1) {
			} else {
			}
		} else {
		}

	}

	static void random() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		System.out.println("How many random numbers would you like?");
		int amount = input.nextInt();
		System.out.println("How big can the numbers to be?(5000 is the highest and 5 is the lowest)");
		int size = input.nextInt();
		if (size < 5) {// stops the size from being under 5
			size = 5;
		} else if (size > 5000) {// stops the size from being over 5000
			size = 5000;
		}
		String filenameOut = "Random.txt";
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(filenameOut);
		} catch (Exception e) {
			System.out.println("Well you see, there was a problem");
			System.exit(0);
		}
		for (int i = 0; i < amount; i++) {
			int numbers = random.nextInt(size + 1);// makes the random number

			outputStream.println(numbers);// prints out the number
		}
		outputStream.close();
		System.out.println("The numbers are saved in Random.txt");
		System.out.println("Any number to continue");
		int cont = input.nextInt();
	}

	static void math() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int num1 = random.nextInt(501);// the two numbers for a question are
										// between 0-500
		int num2 = random.nextInt(501);
		double tot;
		int operator = random.nextInt(4);// determines the operator
		if (operator == 0) {
			tot = num1 + num2;
			int roundTot = (int) Math.round(tot);
			System.out.println("What is " + num1 + "+" + num2 + "?");
			int answer = input.nextInt();
			if (answer == roundTot) {// checks to see if your correct
				System.out.println("Correct");
				System.out.println("The answer was " + roundTot);
			} else {
				System.out.println("Wrong");
				System.out.println("The answer was " + roundTot);
			}
			System.out.println("Any number to continue");
			int cont = input.nextInt();
		}
		if (operator == 1) {
			tot = num1 - num2;
			int roundTot = (int) Math.round(tot);
			System.out.println("What is " + num1 + "-" + num2 + "?");
			int answer = input.nextInt();
			if (answer == roundTot) {
				System.out.println("Correct");
				System.out.println("The answer was " + roundTot);
			} else {
				System.out.println("Wrong");
				System.out.println("The answer was " + roundTot);
			}
			System.out.println("Any number to continue");
			int cont = input.nextInt();
		}
		if (operator == 2) {
			tot = num1 * num2;
			int roundTot = (int) Math.round(tot);
			System.out.println("What is " + num1 + "*" + num2 + "?");
			int answer = input.nextInt();
			if (answer == roundTot) {
				System.out.println("Correct");
				System.out.println("The answer was " + roundTot);
			} else {
				System.out.println("Wrong");
				System.out.println("The answer was " + roundTot);
			}
			System.out.println("Any number to continue");
			int cont = input.nextInt();
		}
		if (operator == 3) {
			tot = num1 / num2;
			int roundTot = (int) Math.round(tot);
			System.out.println("What is " + num1 + "/" + num2
					+ " rounded to the nearest whole number ?");
			int answer = input.nextInt();
			if (answer == roundTot) {
				System.out.println("Correct");
				System.out.println("The answer was " + roundTot);
			} else {
				System.out.println("Wrong");
				System.out.println("The answer was " + roundTot);
			}
			System.out.println("Any number to continue");
			int cont = input.nextInt();
		}
	}

	static void replace() {
		Scanner input = new Scanner(System.in);
		System.out.println("Type a scentance or a word(all lower case)");
		String scent = input.nextLine();
		System.out.println("What letter would you like replaced?(lower case)");
		String letter = input.nextLine();
		System.out.println("What do you want to replace it with?(lower case)");
		String replacer = input.nextLine();
		String cut = scent.replaceAll(" ", "");
		int length = cut.length();
		String[] lett = cut.split("");
		int counter = 0;
		for (int i = 0; i <= length; i++) {
			//if (lett[i].equals(letter)) {
				//counter++;
			//}
		}
		//System.out.println("The amount of " + letter + "'s replaced was "
			//	+ counter);
		System.out.println("Before:");
		System.out.println(scent);
		System.out.println("After:");
		System.out.println(scent.replace(letter, replacer));
		System.out.println("Any number to continue");
		int pi = input.nextInt();
	}
}
