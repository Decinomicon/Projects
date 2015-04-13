import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("What will you like to do?");
		System.out.println("1) login 2) add a password 3) quit");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		if (i == 1) {
			psasswordEnter.enterer();
		} else if (i == 2) {
			passwordSave.saver();
		} else {
		}

	}

}
