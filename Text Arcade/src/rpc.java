import java.util.Random;
import java.util.Scanner;

public class rpc {
	static int rock, paper, scissors;
	static int rockCom, paperCom, scissorsCom;
	static boolean comWin = false, playWin = false, tie = false;

	public static void RPC() {
		rock = 0;
		paper = 0;
		scissors = 0;
		rockCom = 0;
		paperCom = 0;
		scissorsCom = 0;
		comWin = false;
		playWin = false;
		tie = false;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Welcome to rock paper scissors!");
		System.out.println("1) to play against a computer");
		System.out.println("2) to play against a friend");
		int choice = input.nextInt();
		if (choice == 1) {
			comPlay();
			player();
			detrminer();
		} else if (choice == 2) {
			playerName();
		}
	}

	public static void playerName() {
		Scanner input=new Scanner(System.in);
		
	}

	public static void detrminer() {
		if (rockCom == 1 && scissors == 1) {
			comWin = true;
		}
		if (paperCom == 1 && rock == 1) {
			comWin = true;
		}
		if (scissorsCom == 1 && paper == 1) {
			comWin = true;
		}
		if (scissors == 1 && paperCom == 1) {
			playWin = true;
		}
		if (rock == 1 && scissorsCom == 1) {
			playWin = true;
		}
		if (paper == 1 && rockCom == 1) {
			playWin = true;
		}
		if (paper == 1 && paperCom == 1) {
			tie = true;
		}
		if (scissors == 1 && scissorsCom == 1) {
			tie = true;
		}
		if (rock == 1 && rockCom == 1) {
			tie = true;
		}
		System.out.println("");
		System.out.println("");
		if (comWin == true) {
			System.out.println(scissorsCom);
			System.out.println(paperCom);
			System.out.println(rockCom);
			if (scissorsCom == 1) {
				System.out.print("Scissor beats ");
			} else if (paperCom == 1) {
				System.out.print("Paper beats ");
			} else if (rockCom == 1) {
				System.out.print("Rock beats ");
			}
			if (rock == 1) {
				System.out.print("rock");
			} else if (paper == 1) {
				System.out.print("paper");
			} else if (scissors == 1) {
				System.out.print("scissor");
			}
			System.out.println("");
			System.out.println("");
			// while(true){
			System.out.print("YOU LOOSE");
			int i = 0;
			i++;
			if (i == 10) {
				System.out.println("");
				i = 0;
			}

			// }
		} else if (playWin == true) {
			if (scissors == 1) {
				System.out.print("Scissor beats ");
			} else if (paper == 1) {
				System.out.print("Paper beats ");
			} else if (rock == 1) {
				System.out.print("Rock beats ");
			}
			if (rockCom == 1) {
				System.out.print("rock");
			} else if (paperCom == 1) {
				System.out.print("paper");
			} else if (scissorsCom == 1) {
				System.out.print("scissor");
			}
			System.out.println("");
			// while(true){
			System.out.print("YOU WIN");
			int i = 0;
			i++;
			if (i == 10) {
				System.out.println("");
				i = 0;
			}

			// }
		} else if (tie == true) {
			if (rock == 1) {
				System.out.print("You both chose rock, ITS A TIE");
			} else if (paper == 1) {
				System.out.print("You both chose paper, ITS A TIE");
			} else if (scissors == 1) {
				System.out.println("You both chose scissors, ITS A TIE");
			}
		}

	}

	public static void comPlay() {
		Random random = new Random();
		System.out.println("Rock paper scissors, shoot!");
		int comChoice = random.nextInt(3);
		switch (comChoice) {
		case 0:
			rockCom = 1;
			break;
		case 1:
			paperCom = 1;
			break;
		case 2:
			scissorsCom = 1;
			break;
		}
		
	}

	public static void player() {
		Scanner input = new Scanner(System.in);
		System.out.println("1) rock");
		System.out.println("2) paper");
		System.out.println("3) scissors");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			rock = 1;
			break;
		case 2:
			paper = 1;
			break;
		case 3:
			scissors = 1;
			break;
		}

	}
}
