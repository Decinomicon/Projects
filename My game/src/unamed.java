import java.util.*;
import java.io.File;
import java.io.PrintWriter;

public class unamed {
	static int hp, maxHp, armr, attk, armrID, wpnID, once = 0, towny = 0,
			spellDUR, spellSlot1, spellSlot2, spellSlot3, deathVALUE = 0,
			gold = 0;
	static int monsterHP, monsterATTK, monsterARMR, spell1Uses, spell2Uses,
			spell3Uses, followHp1, followHp2, followAtk1, followAtk2,
			followDef1, followDef2, monsterATTK2, monsterARMR2, monsterHP2,
			monsterATTK3, monsterARMR3, monsterHP3, monsterTotal, damageTot,
			exp = 0, maxExp = 10, lvl = 1, maxExpIncrease = 10;
	static int spellFAIL = 1, follow1 = 0, follow2 = 0;
	static int spell1Dmg, spell2Dmg, spell3Dmg, spell1Max, spell2Max,
			spell3Max;
	static String name = "";
	static String monsterName, monsterName2, monsterName3, spellName1,
			spellName2, spellName3, followName1, followName2;
	static String save = "save", death = "death.txt", oldName = "oldName";
	static boolean done = false, saveChoice = false, spellEFF = false,
			spellBuy1 = false, spellBuy2 = false, spellBuy3 = false,
			innRest = false, cancel = true;

	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		Scanner deathINPUT = null;
		Scanner oldNAME = null;
		Scanner Load = null;
		PrintWriter Save = null;
		Random random = new Random();

		try {
			deathINPUT = new Scanner(new File(death));
		} catch (Exception e) {
			System.out.println("Error loading file " + death);
			System.exit(0);
		}
		try {
			oldNAME = new Scanner(new File(oldName));
		} catch (Exception e) {
			System.out.println("Error loading file " + oldName);
			System.exit(0);
		}
		try {
			Load = new Scanner(new File(save));
		} catch (Exception e) {
			System.out.println("Error loading file " + save);
			System.exit(0);
		}
		String saveCheck = Load.nextLine();

		do {
			if (saveCheck.equals("none")) {
				done = true;
			} else {
				System.out
						.println("Would you like to load your previous save?");
				System.out.println("1.) Yes.");
				System.out.println("2.) no.");
				int user = inputInt.nextInt();
				if (user == 1) {
					System.out.println("Are you sure?");
					System.out.println("1.) Yes.");
					System.out.println("2.) No.");
					user = inputInt.nextInt();
					if (user == 1) {
						done = true;
						saveChoice = true;
					} else if (user == 2) {
					} else {
						System.out.println("Invalid input");
					}
				} else if (user == 2) {
					System.out
							.println("Are you sure? If you choose to start anew, your old save will be deleted.");
					System.out.println("1.) Yes.");
					System.out.println("2.) No.");
					user = inputInt.nextInt();
					if (user == 1) {
						try {
							Save = new PrintWriter(save);
						} catch (Exception a) {
						}

						System.out.println("Previous save deleted.");
						Save.println("none");
						done = true;
						Save.close();
					} else if (user == 2) {
					} else {
						System.out.println("Invalid input");
					}
				} else {
					System.out.println("Invalid input");
				}
			}
		} while (done == false);

		if (saveChoice == true) {
			for (int i = 0; i < 26; i++) {
				if (i == 0) {
					name = saveCheck;
				} else if (i == 1) {
					gold = Load.nextInt();
				} else if (i == 2) {
					spellSlot1 = Load.nextInt();
				} else if (i == 3) {
					spellSlot2 = Load.nextInt();
				} else if (i == 4) {
					spellSlot3 = Load.nextInt();
				} else if (i == 5) {
					spell1Uses = Load.nextInt();
				} else if (i == 6) {
					spell2Uses = Load.nextInt();
				} else if (i == 7) {
					spell3Uses = Load.nextInt();
				} else if (i == 8) {
					attk = Load.nextInt();
				} else if (i == 9) {
					armr = Load.nextInt();
				} else if (i == 10) {
					hp = Load.nextInt();
				} else if (i == 11) {
					maxHp = Load.nextInt();
				} else if (i == 12) {
					exp = Load.nextInt();
				} else if (i == 13) {
					maxExp = Load.nextInt();
				} else if (i == 14) {
					lvl = Load.nextInt();
				} else if (i == 15) {
					follow1 = Load.nextInt();
				} else if (i == 16) {
					follow2 = Load.nextInt();
				} else if (i == 17) {
					followName1 = Load.nextLine();
				} else if (i == 18) {
					followName1 = Load.nextLine();
				} else if (i == 19) {
					followName2 = Load.nextLine();
				} else if (i == 20) {
					followAtk1 = Load.nextInt();
				} else if (i == 21) {
					followAtk2 = Load.nextInt();
				} else if (i == 22) {
					followDef1 = Load.nextInt();
				} else if (i == 23) {
					followDef2 = Load.nextInt();
				} else if (i == 24) {
					followHp1 = Load.nextInt();
				} else if (i == 25) {
					followHp2 = Load.nextInt();
				}
			}
		}
		if (saveChoice == false) {
			deathVALUE = deathINPUT.nextInt();
			name = oldNAME.nextLine();

			System.out.print("Welcome to ");
			if (deathVALUE == 1) {
				System.out.println("\"How to die of deppresion.\" Starring "
						+ name + ".");
			} else if (deathVALUE == 2) {
				System.out.println("\"This time, try not to die of boredom.\"");
			} else if (deathVALUE == 3) {
				System.out.println("\"No, that was not a typo.\"");
			} else {
				System.out.println("The Untitled Game.");
			}
			deathINPUT.close();
			oldNAME.close();
			Load.close();

			System.out.println("Choose a Race");

			int sure = 2;
			do {
				int classSelect = 0;

				do {
					System.out.println("Classes:(1)Ork, (2)Elf, (3)Human");
					classSelect = inputInt.nextInt();
					switch (classSelect) {
					case 1:
						System.out.println("Ork:");
						System.out.println("HP: 30");
						System.out.println("Attack: 6");
						System.out.println("Armor: 4");
						System.out.println("starting spell: Rage");
						System.out
								.println("Do you want this class?(1)Yes, (2)No");
						sure = inputInt.nextInt();
						if (sure == 1) {
							hp = 20;
							maxHp = 30;
							armr = 4;
							spell1Uses = 2;
							attk = 7;
							spellSlot1 = 1;
							spellName1 = "Rage";
							gold = 500;
							saveChoice = true;
						}
						break;
					case 2:
						System.out.println("Elf:");
						System.out.println("HP: 20");
						System.out.println("Attack: 3");
						System.out.println("Armor: 1");
						System.out.println("starting spell: Fireball");
						System.out
								.println("Do you want this class?(1)Yes, (2)No");
						sure = inputInt.nextInt();
						if (sure == 1) {
							hp = 20;
							maxHp = 20;
							armr = 1;
							spell1Uses = 3;
							attk = 4;
							spellSlot1 = 2;
							spellName1 = "Fireball";
							saveChoice = true;
						}
						break;
					case 3:
						System.out.println("Human:");
						System.out.println("HP: 30");
						System.out.println("Attack: 5");
						System.out.println("Armor: 2");
						System.out.println("starting spell: Magic Missle");
						System.out.println("Do you want this class?(1)Yes, (2)No");
						sure = inputInt.nextInt();
						if (sure == 1) {
							hp = 30;
							maxHp = 30;
							armr = 2;
							spell1Uses = 4;
							attk = 5;
							spellSlot1 = 3;
							spellName1 = "Magic Missle";
							saveChoice = true;
						}
						break;
					}

				} while (classSelect < 1 || classSelect > 3);
			} while (sure == 2);
			System.out.println("What is your adventurers name?");
			String name69 = inputString.nextLine();
			if(name69.equals("konami")||name69.equals("Konami")){
				name = "^ ^ v v < > < > B A Start";
			}
			else{
				name = name69;
			}
			
		}

		int lvlEncounter = 0;
		while (true) {
			if (lvl < 2) {
				lvlEncounter = 2;
			} else if (lvl >= 2 && lvl <= 4) {
				lvlEncounter = 3;
			} else {
				lvlEncounter = 3;
			}

			int encounter = random.nextInt(lvlEncounter);

			if (once == towny) {
				towny = once + 5;
				spellData();
				town();
			}
			switch (encounter) {
			case 0:
				once++;
				dprsdSkeletons();
				lvlUp();
				break;
			case 1:
				once++;
				boringBlobs();
				lvlUp();
				break;
			case 2:
				once++;
				boringBlobs();
				lvlUp();
				break;
			}
		}
	}

	static void dprsdSkeletons() {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int action, encounters = 0;
		if (follow1 == 1 && follow2 == 0) {
			encounters = 2;
		} else if (follow1 == 0 && follow2 == 1) {
			encounters = 2;
		} else if (follow1 == 1 && follow2 == 1) {
			encounters = 3;
		} else if (follow1 == 0 && follow2 == 0) {
			encounters = 1;
		}
		if (encounters == 1) {
			monsterHP = 10;
			monsterATTK = 50;
			monsterARMR = 2;
			monsterName = "Depressed Skeleton(1)";
		} else if (encounters == 2) {
			monsterHP = 10;
			monsterATTK = 5;
			monsterARMR = 2;
			monsterName = "Depressed Skeleton(1)";

			monsterHP2 = 10;
			monsterATTK2 = 5;
			monsterARMR2 = 2;
			monsterName2 = "Depressed Skeleton(2)";
		} else if (encounters == 3) {
			monsterHP = 10;
			monsterATTK = 5;
			monsterARMR = 2;
			monsterName = "Depressed Skeleton(1)";

			monsterHP2 = 10;
			monsterATTK2 = 5;
			monsterARMR2 = 2;
			monsterName2 = "Depressed Skeleton(2)";

			monsterHP3 = 10;
			monsterATTK3 = 5;
			monsterARMR3 = 2;
			monsterName3 = "Depressed Skeleton(3)";
		}
		monsterTotal = encounters;

		System.out.println(name + " encountered " + encounters
				+ " Depressed Skeleton(s)");
		while (monsterTotal > 0) {
			cancel = true;
			do {
				spellFAIL = 1;
				do {
					if (hp < 0) {
						deathVALUE = 1;
						death();
					}
					System.out.println("What does " + name + " do?");
					System.out.println("(1)Attack (2)Use Spell");
					System.out.println("(3)Status");
					action = input.nextInt();
					if (action == 1) {
						heroAttack();
						if (cancel == true) {
							spellFAIL = 1;
						} else {
							spellFAIL = 0;
						}
					} else if (action == 2) {
						spellUse();
					} else if (action == 3) {
						status();
					}
				} while (spellFAIL == 1 && monsterTotal > 0 && cancel == true);

				if (follow1 == 1 && monsterTotal > 0) {
					follow1attack();
				}
				if (follow2 == 1 && monsterTotal > 0) {
					follow2attack();
				}
			} while (action < 1 || action > 2 && monsterTotal > 0);
			if (monsterHP > 0) {
				monsterAttack();
				if (damageTot <= 0) {
					int message = random.nextInt(5);
					switch (message) {
					case 0:
						System.out.println(monsterName + " shot and missed!");
						break;
					case 1:
						System.out.println(monsterName + " hit a rock!");
						break;
					case 2:
						System.out.println("Swing and a miss");
						break;
					case 3:
						System.out.println(monsterName
								+ " is stairing at the sky");
						break;
					default:
						System.out.println(monsterName
								+ " was going to attack but gave up");
						break;
					}
					System.out.println("Enter any number to continue...");
				}
				int cont = input.nextInt();
			}
			if (monsterHP2 > 0) {
				monsterAttack2();
				if (damageTot <= 0) {
					int message = random.nextInt(5);
					switch (message) {
					case 0:
						System.out.println(monsterName2 + " shot and missed!");
						break;
					case 1:
						System.out.println(monsterName2 + " hit a rock!");
						break;
					case 2:
						System.out.println("Swing and a miss");
						break;
					case 3:
						System.out.println(monsterName2
								+ " is stairing at the sky");
						break;
					default:
						System.out.println(monsterName2
								+ " was going to attack but gave up");
						break;
					}
					System.out.println("Enter any number to continue...");
				}
				int cont = input.nextInt();
			}
			if (monsterHP3 > 0) {
				monsterAttack3();
				if (damageTot <= 0) {
					int message = random.nextInt(5);
					switch (message) {
					case 0:
						System.out.println(monsterName3 + " shot and missed!");
						break;
					case 1:
						System.out.println(monsterName3 + " hit a rock!");
						break;
					case 2:
						System.out.println("Swing and a miss");
						break;
					case 3:
						System.out.println(monsterName3
								+ " is stairing at the sky");
						break;
					default:
						System.out.println(monsterName3
								+ " was going to attack but gave up");
						break;
					}
					System.out.println("Enter any number to continue...");
				}
				int cont = input.nextInt();
			}
		}
		int earnedGold = 0;
		int earnedExp = 0;

		switch (encounters) {
		case 1:
			gold = gold + 5;
			exp = exp + 4;
			earnedGold = 5;
			earnedExp = 4;
			break;
		case 2:
			gold = gold + 10;
			exp = exp + 8;
			earnedGold = 10;
			earnedExp = 8;
			break;
		case 3:
			gold = gold + 15;
			exp = exp + 12;
			earnedGold = 15;
			earnedExp = 12;
			break;
		}
		System.out.println("You earned " + earnedGold + " gold.");
		System.out.println("You earned " + earnedExp + " EXP.");
	}

	static void boringBlobs() {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int action, encounters = 0;
		if (follow1 == 1 && follow2 == 0) {
			encounters = 2;
		} else if (follow1 == 0 && follow2 == 1) {
			encounters = 2;
		} else if (follow1 == 1 && follow2 == 1) {
			encounters = 3;
		} else if (follow1 == 0 && follow2 == 0) {
			encounters = 1;
		}
		if (encounters == 1) {
			monsterHP = 10;
			monsterATTK = 4;
			monsterARMR = 3;
			monsterName = "Boring blob(1)";
		} else if (encounters == 2) {
			monsterHP = 10;
			monsterATTK = 4;
			monsterARMR = 3;
			monsterName = "Boring blob(1)";

			monsterHP2 = 10;
			monsterATTK2 = 4;
			monsterARMR2 = 3;
			monsterName2 = "Boring blob(2)";
		} else if (encounters == 3) {
			monsterHP = 10;
			monsterATTK = 4;
			monsterARMR = 3;
			monsterName = "Boring blob(1)";

			monsterHP2 = 10;
			monsterATTK2 = 4;
			monsterARMR2 = 3;
			monsterName2 = "Boring blob(2)";

			monsterHP3 = 10;
			monsterATTK3 = 4;
			monsterARMR3 = 3;
			monsterName3 = "Boring blob(3)";
		}
		monsterTotal = encounters;

		System.out.println(name + " encountered " + encounters
				+ " Boring blob(s) of blobiness!");
		while (monsterTotal > 0) {
			cancel = true;
			do {
				spellFAIL = 1;
				do {
					if (hp < 0) {
						deathVALUE = 2;
						death();
					}
					System.out.println("What does " + name + " do?");
					System.out.println("(1)Attack (2)Use Spell");
					System.out.println("(3)Status");
					action = input.nextInt();
					if (action == 1) {
						heroAttack();
						if (cancel == true) {
							spellFAIL = 1;
						} else {
							spellFAIL = 0;
						}
					} else if (action == 2) {
						spellUse();
					} else if (action == 3) {
						status();
					}
				} while (spellFAIL == 1 && monsterTotal > 0 && cancel == true);

				if (follow1 == 1 && monsterTotal > 0) {
					follow1attack();
				}
				if (follow2 == 1 && monsterTotal > 0) {
					follow2attack();
				}
			} while (action < 1 || action > 2 && monsterTotal > 0);
			if (monsterHP > 0) {
				monsterAttack();
				if (damageTot <= 0) {
					int message = random.nextInt(5);
					switch (message) {
					case 0:
						System.out.println(monsterName + " shot and missed!");
						break;
					case 1:
						System.out.println(monsterName + " hit a rock!");
						break;
					case 2:
						System.out.println("Swing and a miss");
						break;
					case 3:
						System.out.println(monsterName
								+ " is stairing at the sky");
						break;
					default:
						System.out.println(monsterName
								+ " was going to attack but gave up");
						break;
					}
					System.out.println("Enter any number to continue...");
				}
				int cont = input.nextInt();
			}
			if (monsterHP2 > 0) {
				monsterAttack2();
				if (damageTot <= 0) {
					int message = random.nextInt(5);
					switch (message) {
					case 0:
						System.out.println(monsterName2 + " shot and missed!");
						break;
					case 1:
						System.out.println(monsterName2 + " hit a rock!");
						break;
					case 2:
						System.out.println("Swing and a miss");
						break;
					case 3:
						System.out.println(monsterName2
								+ " is stairing at the sky");
						break;
					default:
						System.out.println(monsterName2
								+ " was going to attack but gave up");
						break;
					}
					System.out.println("Enter any number to continue...");
				}
				int cont = input.nextInt();
			}
			if (monsterHP3 > 0) {
				monsterAttack3();
				if (damageTot <= 0) {
					int message = random.nextInt(5);
					switch (message) {
					case 0:
						System.out.println(monsterName3 + " shot and missed!");
						break;
					case 1:
						System.out.println(monsterName3 + " hit a rock!");
						break;
					case 2:
						System.out.println("Swing and a miss");
						break;
					case 3:
						System.out.println(monsterName3
								+ " is stairing at the sky");
						break;
					default:
						System.out.println(monsterName3
								+ " was going to attack but gave up");
						break;
					}
					System.out.println("Enter any number to continue...");
				}
				int cont = input.nextInt();
			}
		}
		int earnedGold = 0;
		int earnedExp = 0;

		switch (encounters) {
		case 1:
			gold = gold + 4;
			exp = exp + 3;
			earnedGold = 4;
			earnedExp = 3;
			break;
		case 2:
			gold = gold + 8;
			exp = exp + 6;
			earnedGold = 8;
			earnedExp = 6;
			break;
		case 3:
			gold = gold + 12;
			exp = exp + 9;
			earnedGold = 12;
			earnedExp = 9;
			break;
		}
		System.out.println("You earned " + earnedGold + " gold.");
		System.out.println("You earned " + earnedExp + " EXP.");
	}

	static void robitSlugs() {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int action, encounters = 0;
		if (follow1 == 1 && follow2 == 0) {
			encounters = 2;
		} else if (follow1 == 0 && follow2 == 1) {
			encounters = 2;
		} else if (follow1 == 1 && follow2 == 1) {
			encounters = 3;
		} else if (follow1 == 0 && follow2 == 0) {
			encounters = 1;
		}
		if (encounters == 1) {
			monsterHP = 10;
			monsterATTK = 4;
			monsterARMR = 3;
			monsterName = "Boring blob(1)";
		} else if (encounters == 2) {
			monsterHP = 10;
			monsterATTK = 4;
			monsterARMR = 3;
			monsterName = "Boring blob(1)";

			monsterHP2 = 10;
			monsterATTK2 = 4;
			monsterARMR2 = 3;
			monsterName2 = "Boring blob(2)";
		} else if (encounters == 3) {
			monsterHP = 10;
			monsterATTK = 4;
			monsterARMR = 3;
			monsterName = "Boring blob(1)";

			monsterHP2 = 10;
			monsterATTK2 = 4;
			monsterARMR2 = 3;
			monsterName2 = "Boring blob(2)";

			monsterHP3 = 10;
			monsterATTK3 = 4;
			monsterARMR3 = 3;
			monsterName3 = "Boring blob(3)";
		}
		monsterTotal = encounters;

		System.out.println(name + " encountered " + encounters
				+ " Boring blob(s) of blobiness!");
		while (monsterTotal > 0) {
			cancel = true;
			do {
				spellFAIL = 1;
				do {
					if (hp < 0) {
						deathVALUE = 3;
						death();
					}
					System.out.println("What does " + name + " do?");
					System.out.println("(1)Attack (2)Use Spell");
					System.out.println("(3)Status");
					action = input.nextInt();
					if (action == 1) {
						heroAttack();
						if (cancel == true) {
							spellFAIL = 1;
						} else {
							spellFAIL = 0;
						}
					} else if (action == 2) {
						spellUse();
					} else if (action == 3) {
						status();
					}
				} while (spellFAIL == 1 && monsterTotal > 0 && cancel == true);

				if (follow1 == 1 && monsterTotal > 0) {
					follow1attack();
				}
				if (follow2 == 1 && monsterTotal > 0) {
					follow2attack();
				}
			} while (action < 1 || action > 2 && monsterTotal > 0);
			if (monsterHP > 0) {
				monsterAttack();
				if (damageTot <= 0) {
					int message = random.nextInt(5);
					switch (message) {
					case 0:
						System.out.println(monsterName + " shot and missed!");
						break;
					case 1:
						System.out.println(monsterName + " hit a rock!");
						break;
					case 2:
						System.out.println("Swing and a miss");
						break;
					case 3:
						System.out.println(monsterName
								+ " is stairing at the sky");
						break;
					default:
						System.out.println(monsterName
								+ " was going to attack but gave up");
						break;
					}
					System.out.println("Enter any number to continue...");
				}
				int cont = input.nextInt();
			}
			if (monsterHP2 > 0) {
				monsterAttack2();
				if (damageTot <= 0) {
					int message = random.nextInt(5);
					switch (message) {
					case 0:
						System.out.println(monsterName2 + " shot and missed!");
						break;
					case 1:
						System.out.println(monsterName2 + " hit a rock!");
						break;
					case 2:
						System.out.println("Swing and a miss");
						break;
					case 3:
						System.out.println(monsterName2
								+ " is stairing at the sky");
						break;
					default:
						System.out.println(monsterName2
								+ " was going to attack but gave up");
						break;
					}
					System.out.println("Enter any number to continue...");
				}
				int cont = input.nextInt();
			}
			if (monsterHP3 > 0) {
				monsterAttack3();
				if (damageTot <= 0) {
					int message = random.nextInt(5);
					switch (message) {
					case 0:
						System.out.println(monsterName3 + " shot and missed!");
						break;
					case 1:
						System.out.println(monsterName3 + " hit a rock!");
						break;
					case 2:
						System.out.println("Swing and a miss");
						break;
					case 3:
						System.out.println(monsterName3
								+ " is stairing at the sky");
						break;
					default:
						System.out.println(monsterName3
								+ " was going to attack but gave up");
						break;
					}
					System.out.println("Enter any number to continue...");
				}
				int cont = input.nextInt();
			}
		}
		int earnedGold = 0;
		int earnedExp = 0;

		switch (encounters) {
		case 1:
			gold = gold + 4;
			exp = exp + 3;
			earnedGold = 4;
			earnedExp = 3;
		case 2:
			gold = gold + 8;
			exp = exp + 6;
			earnedGold = 8;
			earnedExp = 6;
		case 3:
			gold = gold + 12;
			exp = exp + 9;
			earnedGold = 12;
			earnedExp = 9;
		}
		System.out.println("You earned " + earnedGold + " gold.");
		System.out.println("You earned " + earnedExp + " EXP.");
	}

	static void town() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int namePart1 = random.nextInt(5);
		int namePart2 = random.nextInt(6);
		String name1 = "";
		String name2 = "";
		switch (namePart1) {
		case 0:
			name1 = "Hrath";
			break;
		case 1:
			name1 = "Dang";
			break;
		case 2:
			name1 = "Hog";
			break;
		case 3:
			name1 = "Vroom";
			break;
		case 4:
			name1 = "Gang";
			break;
		}
		switch (namePart2) {
		case 0:
			name2 = "town";
			break;
		case 1:
			name2 = "ville";
			break;
		case 2:
			name2 = "topia";
			break;
		case 3:
			name2 = "burg";
			break;
		case 4:
			name2 = "land";
			break;
		case 5:
			name2 = "shire";
			break;
		/*case 6:
			name2 = "bang";
			break;*/
		}

		System.out.println(name + " is in the town of " + name1 + name2);
		int townSelect = 0;
		int storeChoice = 0;
		int itemChoice = 0;
		do {
			townSelect = 0;
			storeChoice = 0;
			itemChoice = 0;
			System.out.println("What does " + name + " do?");
			System.out.println("1.)Leave");
			System.out.println("2.)explore the town.");
			System.out.println("3.)Status");
			townSelect = input.nextInt();
			if (townSelect == 2) {
				System.out.println("Where would you like to go?");
				System.out.println("1.)Go to the blacksmith.");
				System.out.println("2.)Go to the magic trader.");
				System.out.println("3.)Go to the Inn.");
				System.out.println("4.)Go to the Tavern");
				System.out.println("5.)Save");
				storeChoice = input.nextInt();
				if (storeChoice == 1) {
					blacksmith();
				} else if (storeChoice == 2) {
					magicTrader();
				} else if (storeChoice == 3) {
					inn();
				} else if (storeChoice == 4) {
					followFind();
				} else if (storeChoice == 5) {
					save();
				}

			} else if (townSelect == 3) {
				status();
			}
		} while (townSelect != 1);

	}

	static void death() {
		PrintWriter outputStream = null;
		PrintWriter outputStream2 = null;
		PrintWriter outputStream3 = null;
		try {
			outputStream = new PrintWriter(death);
		} catch (Exception a) {
		}
		try {
			outputStream2 = new PrintWriter(oldName);
		} catch (Exception a) {
		}
		try {
			outputStream3 = new PrintWriter(save);
		} catch (Exception a) {
		}

		System.out.println(name + " has dies");
		System.out.println("The end");
		outputStream.println(deathVALUE);
		outputStream2.print(name);
		outputStream3.println("none");
		outputStream.close();
		outputStream2.close();
		outputStream3.close();
		System.exit(0);
	}

	static void heroAttack() {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int cont;
		int again = 1;
		do {
			again = 0;
			System.out.println("Who will " + name + " attack?");
			if (monsterHP > 0) {
				System.out.println("1.) " + monsterName + " HP: " + monsterHP);
			}
			if (monsterHP2 > 0) {
				System.out
						.println("2.) " + monsterName2 + " HP: " + monsterHP2);
			}
			if (monsterHP3 > 0) {
				System.out
						.println("3.) " + monsterName3 + " HP: " + monsterHP3);
			}
			System.out.println("4.) Cancel");
			int who = input.nextInt();
			if (who == 1) {
				if (monsterHP > 0) {
					cancel = false;
					int attack = random.nextInt(attk);
					double dmg = attack * (monsterARMR / 10.0);
					int attkRed = (int) Math.round(dmg);
					int damageTot = 0;
					damageTot = attack - attkRed;
					monsterHP = monsterHP - damageTot;
					if (monsterHP < 0) {
						monsterHP = 0;
					}
					if (damageTot > 0) {
						System.out.println(monsterName + " took " + damageTot
								+ " damage!");
						System.out.println(monsterName + " HP: " + monsterHP);
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					} else {
						System.out.println(name + " mimssed!");
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
					if (monsterHP == 0) {
						System.out.println(monsterName + " is dead!");
						monsterTotal--;
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
				} else {
					System.out.println(monsterName + " is already dead!");
					again = 1;
				}
			} else if (who == 2) {
				if (monsterHP2 > 0) {
					cancel = false;
					int attack = random.nextInt(attk);
					double dmg = attack * (monsterARMR2 / 10.0);
					int attkRed = (int) Math.round(dmg);
					int damageTot = 0;
					damageTot = attack - attkRed;
					monsterHP2 = monsterHP2 - damageTot;
					if (monsterHP2 < 0) {
						monsterHP2 = 0;
					}
					if (damageTot > 0) {
						System.out.println(monsterName2 + " took " + damageTot
								+ " damage!");
						System.out.println(monsterName2 + " HP: " + monsterHP2);
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					} else {
						System.out.println(name + " mimssed!");
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
					if (monsterHP2 == 0) {
						System.out.println(monsterName2 + " is dead!");
						monsterTotal--;
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
				} else {
					System.out.println(monsterName2 + " is already dead!");
					again = 1;
				}
			} else if (who == 3) {
				if (monsterHP3 > 0) {
					cancel = false;
					int attack = random.nextInt(attk);
					double dmg = attack * (monsterARMR3 / 10.0);
					int attkRed = (int) Math.round(dmg);
					int damageTot = 0;
					damageTot = attack - attkRed;
					monsterHP3 = monsterHP3 - damageTot;
					System.out.println(monsterName3 + " took " + damageTot
							+ " damage!");
					if (monsterHP3 < 0) {
						monsterHP3 = 0;
					}
					if (damageTot > 0) {
						System.out.println(monsterName3 + " took " + damageTot
								+ " damage!");
						System.out.println(monsterName3 + " HP: " + monsterHP3);
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					} else {
						System.out.println(name + " mimssed!");
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
					if (monsterHP3 == 0) {
						System.out.println(monsterName3 + " is dead!");
						monsterTotal--;
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
				} else {
					System.out.println(monsterName3 + " is already dead!");
					again = 1;
				}
			} else if (who == 4) {
				cancel = true;
				again = 0;
			}
		} while (again == 1);
	}

	static void follow1attack() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		boolean done = false;
		int cont;
		do {
			int who = random.nextInt(3);
			if (who == 0) {
				if (monsterHP > 0) {
					System.out
							.println(followName1 + " attacked " + monsterName);
					int attack = random.nextInt(followAtk1);
					double dmg = attack * (monsterARMR / 10.0);
					int attkRed = (int) Math.round(dmg);
					int damageTot = 0;
					damageTot = attack - attkRed;
					monsterHP = monsterHP - damageTot;
					if (monsterHP < 0) {
						monsterHP = 0;
					}
					if (damageTot > 0) {
						System.out.println(monsterName + " took " + damageTot
								+ " damage!");
						System.out.println(monsterName + " HP: " + monsterHP);
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					} else {
						System.out.println(followName1 + " mimssed!");
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
					done = true;
					if (monsterHP <= 0) {
						System.out.println(monsterName + " is dead!");
						System.out.println("Enter any number to continue...");
						monsterTotal--;
						done = true;
						cont = input.nextInt();
					}
				}
			} else if (who == 1) {
				if (monsterHP2 > 0) {
					System.out.println(followName1 + " attacked "
							+ monsterName2);
					int attack = random.nextInt(followAtk1);
					double dmg = attack * (monsterARMR2 / 10.0);
					int attkRed = (int) Math.round(dmg);
					int damageTot = 0;
					damageTot = attack - attkRed;
					monsterHP2 = monsterHP2 - damageTot;
					if (monsterHP2 < 0) {
						monsterHP2 = 0;
					}
					if (damageTot > 0) {
						System.out.println(monsterName2 + " took " + damageTot
								+ " damage!");
						System.out.println(monsterName2 + " HP: " + monsterHP2);
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					} else {
						System.out.println(followName1 + " mimssed!");
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
					done = true;
					if (monsterHP2 <= 0) {
						System.out.println(monsterName2 + " is dead!");
						System.out.println("Enter any number to continue...");
						monsterTotal--;
						done = true;
						cont = input.nextInt();
					}
				}
			} else if (who == 2) {
				if (monsterHP3 > 0) {
					System.out.println(followName1 + " attacked "
							+ monsterName3);
					int attack = random.nextInt(followAtk1);
					double dmg = attack * (monsterARMR3 / 10.0);
					int attkRed = (int) Math.round(dmg);
					int damageTot = 0;
					damageTot = attack - attkRed;
					monsterHP3 = monsterHP3 - damageTot;
					if (monsterHP3 < 0) {
						monsterHP3 = 0;
					}
					if (damageTot > 0) {
						System.out.println(monsterName3 + " took " + damageTot
								+ " damage!");
						System.out.println(monsterName3 + " HP: " + monsterHP3);
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					} else {
						System.out.println(followName1 + " mimssed!");
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
					done = true;
					if (monsterHP3 <= 0) {
						System.out.println(monsterName3 + " is dead!");
						System.out.println("Enter any number to continue...");
						done = true;
						monsterTotal--;
						cont = input.nextInt();
					}
				}
			}
		} while (done == false);
	}

	static void follow2attack() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		boolean done = false;
		int cont;

		do {
			int who = random.nextInt(3);
			if (who == 0) {
				if (monsterHP > 0) {
					System.out
							.println(followName2 + " attacked " + monsterName);
					int attack = random.nextInt(followAtk2);
					double dmg = attack * (monsterARMR / 10.0);
					int attkRed = (int) Math.round(dmg);
					int damageTot = 0;
					damageTot = attack - attkRed;
					monsterHP = monsterHP - damageTot;
					if (monsterHP < 0) {
						monsterHP = 0;
					}
					if (damageTot > 0) {
						System.out.println(monsterName + " took " + damageTot
								+ " damage!");
						System.out.println(monsterName + " HP: " + monsterHP);
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					} else {
						System.out.println(followName2 + " mimssed!");
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
					done = true;
					if (monsterHP <= 0) {
						System.out.println(monsterName + " is dead!");
						System.out.println("Enter any number to continue...");
						done = true;
						monsterTotal--;
						cont = input.nextInt();

					}
				}
			} else if (who == 1) {
				if (monsterHP2 > 0) {
					System.out.println(followName2 + " attacked "
							+ monsterName2);
					int attack = random.nextInt(followAtk2);
					double dmg = attack * (monsterARMR2 / 10.0);
					int attkRed = (int) Math.round(dmg);
					int damageTot = 0;
					damageTot = attack - attkRed;
					monsterHP2 = monsterHP2 - damageTot;
					if (monsterHP2 < 0) {
						monsterHP2 = 0;
					}
					if (damageTot > 0) {
						System.out.println(monsterName2 + " took " + damageTot
								+ " damage!");
						System.out.println(monsterName2 + " HP: " + monsterHP2);
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					} else {
						System.out.println(followName2 + " mimssed!");
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
					done = true;
					if (monsterHP2 <= 0) {
						System.out.println(monsterName2 + " is dead!");
						System.out.println("Enter any number to continue...");
						done = true;
						monsterTotal--;
						cont = input.nextInt();
					}
				}
			} else if (who == 2) {
				if (monsterHP3 > 0) {
					System.out.println(followName2 + " attacked "
							+ monsterName3);
					int attack = random.nextInt(followAtk2);
					double dmg = attack * (monsterARMR3 / 10.0);
					int attkRed = (int) Math.round(dmg);
					int damageTot = 0;
					damageTot = attack - attkRed;
					monsterHP3 = monsterHP3 - damageTot;
					if (monsterHP3 < 0) {
						monsterHP3 = 0;
					}
					if (damageTot > 0) {
						System.out.println(monsterName3 + " took " + damageTot
								+ " damage!");
						System.out.println(monsterName3 + " HP: " + monsterHP3);
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					} else {
						System.out.println(followName2 + " mimssed!");
						System.out.println("Enter any number to continue...");
						cont = input.nextInt();
					}
					done = true;
					if (monsterHP3 <= 0) {
						System.out.println(monsterName3 + " is dead!");
						System.out.println("Enter any number to continue...");
						done = true;
						monsterTotal--;
						cont = input.nextInt();
					}
				}
			}
		} while (done == false);
	}

	static void monsterAttack() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int who = 0;
		if (follow1 == 0 && follow2 == 0) {
			System.out.println(monsterName + " attacks " + name + "!");
			int attack = random.nextInt(monsterATTK);
			double dmg = attack * (armr / 10.0);
			int attkRed = (int) Math.round(dmg);
			damageTot = 0;
			damageTot = attack - attkRed;
			if (damageTot < 0) {
				damageTot = 0;
			}
			hp = hp - damageTot;
			if (damageTot > 0) {
				System.out.println(name + " took " + damageTot + " damage!");
				System.out.println(name + " HP: " + hp);
				System.out.println("Enter any number to continue...");
			}

		} else if (follow1 == 1 && follow2 == 0) {
			who = random.nextInt(2);
			if (who == 0) {
				System.out.println(monsterName + " attacks " + name + "!");
				int attack = random.nextInt(monsterATTK);
				double dmg = attack * (armr / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				hp = hp - damageTot;
				if (damageTot > 0) {
					System.out
							.println(name + " took " + damageTot + " damage!");
					System.out.println(name + " HP: " + hp);
					System.out.println("Enter any number to continue...");
				}
			} else if (who == 1) {
				System.out.println(monsterName + " attacks " + followName1
						+ "!");
				int attack = random.nextInt(monsterATTK);
				double dmg = attack * (followDef1 / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				followHp1 = followHp1 - damageTot;
				if (damageTot > 0) {
					System.out.println(followName1 + " took " + damageTot
							+ " damage!");
					System.out.println(followName1 + " HP: " + followHp1);
					if (followHp1 <= 0) {
						follow1 = 0;
						System.out.println(followName1 + " has died!");
					}
					System.out.println("Enter any number to continue...");
				}
			}

		} else if (follow1 == 0 && follow2 == 1) {
			who = random.nextInt(3);
			if (who == 0) {
				System.out.println(monsterName + " attacks " + name + "!");
				int attack = random.nextInt(monsterATTK);
				double dmg = attack * (armr / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				hp = hp - damageTot;
				if (damageTot > 0) {
					System.out
							.println(name + " took " + damageTot + " damage!");
					System.out.println(name + " HP: " + hp);
					System.out.println("Enter any number to continue...");
				}
			} else if (who == 1) {
				System.out.println(monsterName + " attacks " + followName2
						+ "!");
				int attack = random.nextInt(monsterATTK);
				double dmg = attack * (followDef2 / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				followHp2 = followHp2 - damageTot;
				if (damageTot > 0) {
					System.out.println(followName2 + " took " + damageTot
							+ " damage!");
					System.out.println(followName2 + " HP: " + followHp2);
					if (followHp2 <= 0) {
						follow2 = 0;
						System.out.println(followName2 + " has died!");
					}

					System.out.println("Enter any number to continue...");
				}
			}
		} else if (follow1 == 1 && follow2 == 1) {
			who = random.nextInt(2);
			if (who == 0) {
				System.out.println(monsterName + " attacks " + name + "!");
				int attack = random.nextInt(monsterATTK);
				double dmg = attack * (armr / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				hp = hp - damageTot;
				if (damageTot > 0) {
					System.out
							.println(name + " took " + damageTot + " damage!");
					System.out.println(name + " HP: " + hp);
					System.out.println("Enter any number to continue...");
				}
			} else if (who == 1) {
				System.out.println(monsterName + " attacks " + followName1
						+ "!");
				int attack = random.nextInt(monsterATTK);
				double dmg = attack * (followDef1 / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				followHp1 = followHp1 - damageTot;
				if (damageTot > 0) {
					System.out.println(followName1 + " took " + damageTot
							+ " damage!");
					System.out.println(followName1 + " HP: " + followHp1);
					if (followHp1 <= 0) {
						follow1 = 0;
						System.out.println(followName1 + " has died!");
					}

					System.out.println("Enter any number to continue...");
				}
			}
		} else if (who == 2) {
			System.out.println(monsterName + " attacks " + followName2 + "!");
			int attack = random.nextInt(monsterATTK);
			double dmg = attack * (followDef2 / 10.0);
			int attkRed = (int) Math.round(dmg);
			damageTot = 0;
			damageTot = attack - attkRed;
			if (damageTot < 0) {
				damageTot = 0;
			}
			followHp2 = followHp2 - damageTot;
			if (damageTot > 0) {
				System.out.println(followName2 + " took " + damageTot
						+ " damage!");
				System.out.println(followName2 + " HP: " + followHp2);
				if (followHp2 <= 0) {
					follow2 = 0;
					System.out.println(followName2 + " has died!");
				}

				System.out.println("Enter any number to continue...");
			}
		}
	}

	static void monsterAttack2() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int who;
		if (follow1 == 0 && follow2 == 0) {
			System.out.println(monsterName2 + " attacks " + name + "!");
			int attack = random.nextInt(monsterATTK2);
			double dmg = attack * (armr / 10.0);
			int attkRed = (int) Math.round(dmg);
			damageTot = 0;
			damageTot = attack - attkRed;
			if (damageTot < 0) {
				damageTot = 0;
			}
			hp = hp - damageTot;
			if (damageTot > 0) {
				System.out.println(name + " took " + damageTot + " damage!");
				System.out.println(name + " HP: " + hp);
				System.out.println("Enter any number to continue...");
			}

		} else if (follow1 == 1 && follow2 == 0) {
			who = random.nextInt(2);
			if (who == 0) {
				System.out.println(monsterName2 + " attacks " + name + "!");
				int attack = random.nextInt(monsterATTK2);
				double dmg = attack * (armr / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				hp = hp - damageTot;
				if (damageTot > 0) {
					System.out
							.println(name + " took " + damageTot + " damage!");
					System.out.println(name + " HP: " + hp);
					System.out.println("Enter any number to continue...");
				}
			} else if (who == 1) {
				System.out.println(monsterName2 + " attacks " + followName1
						+ "!");
				int attack = random.nextInt(monsterATTK2);
				double dmg = attack * (followDef1 / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				followHp1 = followHp1 - damageTot;
				if (damageTot > 0) {
					System.out.println(followName1 + " took " + damageTot
							+ " damage!");
					System.out.println(followName1 + " HP: " + followHp1);
					if (followHp1 <= 0) {
						follow1 = 0;
						System.out.println(followName1 + " has died!");
					}

					System.out.println("Enter any number to continue...");
				}
			}

		} else if (follow1 == 0 && follow2 == 1) {
			who = random.nextInt(2);
			if (who == 0) {
				System.out.println(monsterName2 + " attacks " + name + "!");
				int attack = random.nextInt(monsterATTK2);
				double dmg = attack * (armr / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				hp = hp - damageTot;
				if (damageTot > 0) {
					System.out
							.println(name + " took " + damageTot + " damage!");
					System.out.println(name + " HP: " + hp);
					System.out.println("Enter any number to continue...");
				}
			} else if (who == 1) {
				System.out.println(monsterName2 + " attacks " + followName2
						+ "!");
				int attack = random.nextInt(monsterATTK2);
				double dmg = attack * (followDef2 / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				followHp2 = followHp2 - damageTot;
				if (damageTot > 0) {
					System.out.println(followName2 + " took " + damageTot
							+ " damage!");
					System.out.println(followName2 + " HP: " + followHp2);
					if (followHp2 <= 0) {
						follow2 = 0;
						System.out.println(followName2 + " has died!");
					}

					System.out.println("Enter any number to continue...");
				}
			}
		} else if (follow1 == 1 && follow2 == 1) {
			who = random.nextInt(3);
			if (who == 0) {
				System.out.println(monsterName2 + " attacks " + name + "!");
				int attack = random.nextInt(monsterATTK2);
				double dmg = attack * (armr / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				hp = hp - damageTot;
				if (damageTot > 0) {
					System.out
							.println(name + " took " + damageTot + " damage!");
					System.out.println(name + " HP: " + hp);
					System.out.println("Enter any number to continue...");
				}
			} else if (who == 1) {
				System.out.println(monsterName2 + " attacks " + followName1
						+ "!");
				int attack = random.nextInt(monsterATTK2);
				double dmg = attack * (followDef1 / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				followHp1 = followHp1 - damageTot;
				if (damageTot > 0) {
					System.out.println(followName1 + " took " + damageTot
							+ " damage!");
					System.out.println(followName1 + " HP: " + followHp1);
					if (followHp1 <= 0) {
						follow1 = 0;
						System.out.println(followName1 + " has died!");
					}

					System.out.println("Enter any number to continue...");
				}
			} else if (who == 2) {
				System.out.println(monsterName2 + " attacks " + followName2
						+ "!");
				int attack = random.nextInt(monsterATTK2);
				double dmg = attack * (followDef2 / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				followHp2 = followHp2 - damageTot;
				if (damageTot > 0) {
					System.out.println(followName2 + " took " + damageTot
							+ " damage!");
					System.out.println(followName2 + " HP: " + followHp2);
					if (followHp2 <= 0) {
						follow2 = 0;
						System.out.println(followName2 + " has died!");
					}

					System.out.println("Enter any number to continue...");
				}
			}
		}
	}

	static void monsterAttack3() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int who;
		if (follow1 == 0 && follow2 == 0) {
			System.out.println(monsterName3 + " attacks " + name + "!");
			int attack = random.nextInt(monsterATTK3);
			double dmg = attack * (armr / 10.0);
			int attkRed = (int) Math.round(dmg);
			damageTot = 0;
			damageTot = attack - attkRed;
			if (damageTot < 0) {
				damageTot = 0;
			}
			hp = hp - damageTot;
			if (damageTot > 0) {
				System.out.println(name + " took " + damageTot + " damage!");
				System.out.println(name + " HP: " + hp);
				System.out.println("Enter any number to continue...");
			}

		} else if (follow1 == 1 && follow2 == 0) {
			who = random.nextInt(2);
			if (who == 0) {
				System.out.println(monsterName3 + " attacks " + name + "!");
				int attack = random.nextInt(monsterATTK3);
				double dmg = attack * (armr / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				hp = hp - damageTot;
				if (damageTot > 0) {
					System.out
							.println(name + " took " + damageTot + " damage!");
					System.out.println(name + " HP: " + hp);
					System.out.println("Enter any number to continue...");
				}
			} else if (who == 1) {
				System.out.println(monsterName3 + " attacks " + followName1
						+ "!");
				int attack = random.nextInt(monsterATTK3);
				double dmg = attack * (followDef1 / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				followHp1 = followHp1 - damageTot;
				if (damageTot > 0) {
					System.out.println(followName1 + " took " + damageTot
							+ " damage!");
					System.out.println(followName1 + " HP: " + followHp1);
					if (followHp1 <= 0) {
						follow1 = 0;
						System.out.println(followName1 + " has died!");
					}

					System.out.println("Enter any number to continue...");
				}
			}

		} else if (follow1 == 0 && follow2 == 1) {
			who = random.nextInt(2);
			if (who == 0) {
				System.out.println(monsterName3 + " attacks " + name + "!");
				int attack = random.nextInt(monsterATTK3);
				double dmg = attack * (armr / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				hp = hp - damageTot;
				if (damageTot > 0) {
					System.out
							.println(name + " took " + damageTot + " damage!");
					System.out.println(name + " HP: " + hp);
					System.out.println("Enter any number to continue...");
				}
			} else if (who == 1) {
				System.out.println(monsterName3 + " attacks " + followName2
						+ "!");
				int attack = random.nextInt(monsterATTK3);
				double dmg = attack * (followDef2 / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				followHp2 = followHp2 - damageTot;
				if (damageTot > 0) {
					System.out.println(followName2 + " took " + damageTot
							+ " damage!");
					System.out.println(followName2 + " HP: " + followHp2);
					if (followHp2 <= 0) {
						follow2 = 0;
						System.out.println(followName2 + " has died!");
					}

					System.out.println("Enter any number to continue...");
				}
			}
		} else if (follow1 == 1 && follow2 == 1) {
			who = random.nextInt(2);
			if (who == 0) {
				System.out.println(monsterName3 + " attacks " + name + "!");
				int attack = random.nextInt(monsterATTK3);
				double dmg = attack * (armr / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				hp = hp - damageTot;
				if (damageTot > 0) {
					System.out
							.println(name + " took " + damageTot + " damage!");
					System.out.println(name + " HP: " + hp);
					System.out.println("Enter any number to continue...");
				}
			} else if (who == 1) {
				System.out.println(monsterName3 + " attacks " + followName1
						+ "!");
				int attack = random.nextInt(monsterATTK3);
				double dmg = attack * (followDef1 / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				followHp1 = followHp1 - damageTot;
				if (damageTot > 0) {
					System.out.println(followName1 + " took " + damageTot
							+ " damage!");
					System.out.println(followName1 + " HP: " + followHp1);
					if (followHp1 <= 0) {
						follow1 = 0;
						System.out.println(followName1 + " has died!");
					}

					System.out.println("Enter any number to continue...");
				}
			} else if (who == 2) {
				System.out.println(monsterName3 + " attacks " + followName2
						+ "!");
				int attack = random.nextInt(monsterATTK3);
				double dmg = attack * (followDef2 / 10.0);
				int attkRed = (int) Math.round(dmg);
				damageTot = 0;
				damageTot = attack - attkRed;
				if (damageTot < 0) {
					damageTot = 0;
				}
				followHp2 = followHp2 - damageTot;
				if (damageTot > 0) {
					System.out.println(followName2 + " took " + damageTot
							+ " damage!");
					System.out.println(followName2 + " HP: " + followHp2);
					if (followHp2 <= 0) {
						follow2 = 0;
						System.out.println(followName2 + " has died!");
					}

					System.out.println("Enter any number to continue...");
				}
			}
		}

	}

	static void spellUse() {
		Scanner input = new Scanner(System.in);
		int target;
		System.out.println("Choose your spell");
		if (spell1Uses > 0 || spell2Uses > 0 || spell3Uses > 0) {
			if (spellSlot1 > 0) {
				System.out.println(spellName1 + " Uses: " + spell1Uses);
			}
			if (spellSlot2 > 0) {
				System.out.println(spellName2 + " Uses: " + spell2Uses);
			}
			if (spellSlot3 > 0) {
				System.out.println(spellName3 + " Uses: " + spell3Uses);
			}
			System.out.println("1.) " + spellName1);
			if (spellSlot2 > 0) {
				System.out.print("2.) " + spellName2);
			}
			if (spellSlot3 > 0) {
				System.out.print("3.) " + spellName3);
			}
			System.out.println("4.) Cancel");
			int spellChoice = input.nextInt();
			int again = 0;

			while (again == 0 && spellChoice < 4) {
				System.out.println("Who would " + name + " like to target");
				if (monsterHP > 0) {
					System.out.println(monsterName + " HP: " + monsterHP);
				}
				if (monsterHP2 > 0) {
					System.out.println(monsterName2 + " HP: " + monsterHP2);
				}
				if (monsterHP3 > 0) {
					System.out.println(monsterName3 + " HP: " + monsterHP3);
				}
				target = input.nextInt();
				if (target == 1 && monsterHP > 0) {
					cancel = false;
					if (spellChoice == 1) {
						again = 1;
						monsterHP = monsterHP - spell1Dmg;
						System.out.println("The " + monsterName + " took "
								+ spell1Dmg + " Damage!");
						spell1Uses--;
						if (monsterHP <= 0) {
							monsterHP = 0;
							System.out.println(monsterName + " has died");
							monsterTotal--;
						} else {
							System.out.println(monsterName + " HP: "
									+ monsterHP);
						}
						System.out.println("Enter any number to continue...");
						int cont = input.nextInt();
						spellFAIL = 0;
					} else if (spellChoice == 2) {
						again = 1;
						monsterHP = monsterHP - spell2Dmg;
						System.out.println("The " + monsterName + " took "
								+ spell2Dmg + " Damage!");
						spell2Uses--;
						if (monsterHP <= 0) {
							monsterHP = 0;
							System.out.println(monsterName + " has died");
							monsterTotal--;
						} else {
							System.out.println(monsterName + " HP: "
									+ monsterHP);
						}
						System.out.println("Enter any number to continue...");
						int cont = input.nextInt();
						spellFAIL = 0;
					} else if (spellChoice == 3) {
						again = 1;
						monsterHP = monsterHP - spell3Dmg;
						System.out.println("The " + monsterName + " took "
								+ spell3Dmg + " Damage!");
						spell3Uses--;
						if (monsterHP <= 0) {
							monsterHP = 0;
							System.out.println(monsterName + " has died");
							monsterTotal--;
						} else {
							System.out.println(monsterName + " HP: "
									+ monsterHP);
						}
						System.out.println("Enter any number to continue...");
						int cont = input.nextInt();
						spellFAIL = 0;
					}
				} else if (target == 1 && monsterHP < 1) {
					System.out.println(monsterName + " is already dead!");
				}
				if (target == 2 && monsterHP2 > 0) {
					cancel = false;
					if (spellChoice == 1) {
						again = 1;
						monsterHP2 = monsterHP2 - spell1Dmg;
						System.out.println("The " + monsterName2 + " took "
								+ spell1Dmg + " Damage!");
						spell1Uses--;
						if (monsterHP2 <= 0) {
							monsterHP2 = 0;
							System.out.println(monsterName2 + " has died");
							monsterTotal--;
						} else {
							System.out.println(monsterName2 + " HP: "
									+ monsterHP2);
						}
						System.out.println("Enter any number to continue...");
						int cont = input.nextInt();
						spellFAIL = 0;
					} else if (spellChoice == 2) {
						again = 1;
						monsterHP2 = monsterHP2 - spell2Dmg;
						System.out.println("The " + monsterName2 + " took "
								+ spell2Dmg + " Damage!");
						spell2Uses--;
						if (monsterHP2 <= 0) {
							monsterHP2 = 0;
							System.out.println(monsterName2 + " has died");
							monsterTotal--;
						} else {
							System.out.println(monsterName2 + " HP: "
									+ monsterHP2);
						}
						System.out.println("Enter any number to continue...");
						int cont = input.nextInt();
						spellFAIL = 0;
					} else if (spellChoice == 3) {
						again = 1;
						monsterHP2 = monsterHP2 - spell3Dmg;
						System.out.println("The " + monsterName2 + " took "
								+ spell3Dmg + " Damage!");
						spell3Uses--;
						if (monsterHP2 <= 0) {
							monsterHP2 = 0;
							System.out.println(monsterName2 + " has died");
							monsterTotal--;
						} else {
							System.out.println(monsterName2 + " HP: "
									+ monsterHP2);
						}
						System.out.println("Enter any number to continue...");
						int cont = input.nextInt();
						spellFAIL = 0;
					}
				} else if (target == 2 && monsterHP2 < 1) {
					System.out.println(monsterName2 + " is already dead!");
				}
				if (target == 3 && monsterHP3 > 0) {
					cancel = false;
					if (spellChoice == 1) {
						again = 1;
						monsterHP3 = monsterHP3 - spell1Dmg;
						System.out.println("The " + monsterName3 + " took "
								+ spell1Dmg + " Damage!");
						spell1Uses--;
						if (monsterHP3 <= 0) {
							monsterHP3 = 0;
							System.out.println(monsterName3 + " has died");
							monsterTotal--;
						} else {
							System.out.println(monsterName3 + " HP: "
									+ monsterHP3);
						}
						System.out.println("Enter any number to continue...");
						int cont = input.nextInt();
						spellFAIL = 0;
					} else if (spellChoice == 2) {
						again = 1;
						monsterHP3 = monsterHP3 - spell2Dmg;
						System.out.println("The " + monsterName3 + " took "
								+ spell2Dmg + " Damage!");
						spell2Uses--;
						if (monsterHP3 <= 0) {
							monsterHP3 = 0;
							System.out.println(monsterName3 + " has died");
							monsterTotal--;
						} else {
							System.out.println(monsterName3 + " HP: "
									+ monsterHP3);
						}
						System.out.println("Enter any number to continue...");
						int cont = input.nextInt();
						spellFAIL = 0;
					} else if (spellChoice == 3) {
						again = 1;
						monsterHP3 = monsterHP3 - spell3Dmg;
						System.out.println("The " + monsterName3 + " took "
								+ spell3Dmg + " Damage!");
						spell3Uses--;
						if (monsterHP3 <= 0) {
							monsterHP3 = 0;
							System.out.println(monsterName3 + " has died");
							monsterTotal--;
						} else {
							System.out.println(monsterName3 + " HP: "
									+ monsterHP3);
						}
						System.out.println("Enter any number to continue...");
						int cont = input.nextInt();
						spellFAIL = 0;
					}
				} else if (target == 2 && monsterHP3 < 1) {
					System.out.println(monsterName3 + " is already dead!");
				}
			}
		} else {
			System.out.println(name + " has no avilable spells!");
			System.out.println("Enter any number to continue...");
			int cont = input.nextInt();
			spellFAIL = 1;
		}
	}

	static void spellData() {
		if (spellSlot1 == 1) {
			spell1Max = 2;
			spell1Dmg = attk * 2;
			spell1Dmg = spell1Dmg - 2;
			spellName1 = "Rage";
		} else if (spellSlot1 == 2) {
			spell1Max = 3;
			spell1Dmg = 6;
			spellName1 = "Fireball";
		} else if (spellSlot1 == 3) {
			spell1Max = 4;
			spell1Dmg = 4;
			spellName1 = "Magic Missle";
		} else if (spellSlot1 == 4) {
			spell1Max = 2;
			spell1Dmg = 10;
			spellName1 = "Meteor Mash";
		}
		if (spellSlot2 == 1) {
			spell2Max = 2;
			spell2Dmg = attk * 2;
			spell1Dmg = spell1Dmg - 2;
			spellName2 = "Rage";
		} else if (spellSlot2 == 2) {
			spell2Max = 3;
			spell2Dmg = 6;
			spellName2 = "Fireball";
		} else if (spellSlot2 == 3) {
			spell2Max = 4;
			spell2Dmg = 4;
			spellName2 = "Magic Missle";
		} else if (spellSlot2 == 4) {
			spell2Max = 2;
			spell2Dmg = 10;
			spellName2 = "Meteor Mash";
		}
		if (spellSlot3 == 1) {
			spell3Max = 2;
			spell3Dmg = attk * 2;
			spell1Dmg = spell1Dmg - 2;
			spellName3 = "Rage";
		} else if (spellSlot3 == 2) {
			spell3Max = 3;
			spell3Dmg = 6;
			spellName3 = "Fireball";
		} else if (spellSlot3 == 3) {
			spell3Max = 4;
			spell3Dmg = 4;
			spellName3 = "Magic Missle";
		} else if (spellSlot3 == 4) {
			spell3Max = 2;
			spell3Dmg = 10;
			spellName3 = "Meteor Mash";
		}
		if (spellBuy1 = true) {
			spell1Uses = spell1Max;
		} else if (spellBuy2 = true) {
			spell2Uses = spell2Max;
		} else if (spellBuy3 = true) {
			spell3Uses = spell3Max;
		}
		if (innRest = true) {
			spell1Uses = spell1Max;
			spell2Uses = spell2Max;
			spell3Uses = spell3Max;
		}
	}

	static void status() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name: " + name);
		System.out.println("LVL: " + lvl);
		System.out.println("EXP: " + exp);
		System.out.println("EXP to next LVL: " + maxExp);
		System.out.println("HP: " + hp + "/" + maxHp);
		System.out.println("Gold: " + gold);
		System.out.println("Armor: " + armr);
		int actualAttack = attk - 1;
		System.out.println("Attack: " + actualAttack);
		System.out.println("Spell 1: " + spellName1 + " Uses: " + spell1Uses);
		if (spellSlot2 > 0) {
			System.out.println("Spell 2: " + spellName2 + " Uses: "
					+ spell2Uses);
		}
		if (spellSlot3 > 0) {
			System.out.println("Spell 3: " + spellName3 + " Uses: "
					+ spell3Uses);
		}
		if (follow1 == 1) {
			System.out.println("");
			System.out.println("Name: " + followName1);
			System.out.println("Attack: " + followAtk1);
			System.out.println("Defence: " + followDef1);
			System.out.println("Hp: " + followHp1);
		}
		if (follow2 == 1) {
			System.out.println("");
			System.out.println("Name: " + followName2);
			System.out.println("Attack: " + followAtk2);
			System.out.println("Defence: " + followDef2);
			System.out.println("Hp: " + followHp2);
		}
		System.out.println("Enter any number to continue...");
		int cont = input.nextInt();
	}

	static void blacksmith() {
		int itemChoice;
		Scanner input = new Scanner(System.in);
		System.out
				.println("Welcome to the blacksmith! What would you like to purchase?");
		do {
			System.out.println("1.)chainmail: +2 armor");
			System.out.println("2.)Iron breastplate: +4 armor");
			System.out.println("3.)Dagger: +1 dmg");
			System.out.println("4.)shortsword: +2 dmg");
			System.out.println("5.)long sword: +4 dmg");
			System.out.println("6.)Exit blacksmith.");
			itemChoice = input.nextInt();
			switch (itemChoice) {
			case 1:
				System.out.println("Price: 10 gold");
				System.out.println("You have " + gold + " gold.");
				System.out
						.println("Are you sure you would like to make this purchase?");
				System.out.println("1.) Yes.");
				System.out.println("2.) No.");
				itemChoice = input.nextInt();
				if (itemChoice == 1 && gold >= 10) {
					armr = armr + 2;
					System.out.println("Thank you for the purchase!");
					gold = gold - 10;
				} else if (itemChoice == 2) {
					System.out
							.println("Okay, well what would you like to purchase then?");
				} else {
					System.out.println("You don't have enough money for that!");
					System.out
							.println("Would you like to purchase something else?");
				}
				break;
			case 2:
				System.out.println("Price: 25 gold");
				System.out.println("You have " + gold + " gold.");
				System.out
						.println("Are you sure you would like to make this purchase?");
				System.out.println("1.) Yes.");
				System.out.println("2.) No.");
				itemChoice = input.nextInt();
				if (itemChoice == 1 && gold >= 25) {
					armr = armr + 4;
					System.out.println("Thank you for the purchase!");
					gold = gold - 25;
				} else if (itemChoice == 2) {
					System.out
							.println("Okay, well what would you like to purchase then?");
				} else {
					System.out.println("You don't have enough money for that!");
					System.out
							.println("Would you like to purchase something else?");
				}
				break;
			case 3:
				System.out.println("Price: 10 gold");
				System.out.println("You have " + gold + " gold.");
				System.out
						.println("Are you sure you would like to make this purchase?");
				System.out.println("1.) Yes.");
				System.out.println("2.) No.");
				itemChoice = input.nextInt();
				if (itemChoice == 1 && gold >= 10) {
					armr = armr + 2;
					System.out.println("Thank you for the purchase!");
					gold = gold - 10;
				} else if (itemChoice == 2) {
					System.out
							.println("Okay, well what would you like to purchase then?");
				} else {
					System.out.println("You don't have enough money for that!");
					System.out
							.println("Would you like to purchase something else?");
				}
				break;
			case 4:
				System.out.println("Price: 20 gold");
				System.out.println("You have " + gold + " gold.");
				System.out
						.println("Are you sure you would like to make this purchase?");
				System.out.println("1.) Yes.");
				System.out.println("2.) No.");
				itemChoice = input.nextInt();
				if (itemChoice == 1 && gold >= 20) {
					armr = armr + 2;
					System.out.println("Thank you for the purchase!");
					gold = gold - 20;
				} else if (itemChoice == 2) {
					System.out
							.println("Okay, well what would you like to purchase then?");
				} else {
					System.out.println("You don't have enough money for that!");
					System.out
							.println("Would you like to purchase something else?");
				}
				break;
			case 5:
				System.out.println("Price: 30 gold");
				System.out.println("You have " + gold + " gold.");
				System.out
						.println("Are you sure you would like to make this purchase?");
				System.out.println("1.) Yes.");
				System.out.println("2.) No.");
				itemChoice = input.nextInt();
				if (itemChoice == 1 && gold >= 30) {
					armr = armr + 2;
					System.out.println("Thank you for the purchase!");
					gold = gold - 30;
				} else if (itemChoice == 2) {
					System.out
							.println("Okay, well what would you like to purchase then?");
				} else {
					System.out.println("You don't have enough money for that!");
					System.out
							.println("Would you like to purchase something else?");
				}
				break;
			}
		} while (itemChoice != 6);
	}

	static void inn() {
		int itemChoice;
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Inn!");
		System.out.println("Would you like to rest up? It only costs 10 gold.");
		System.out.println("You have " + gold + " gold.");
		System.out.println("1.) Yes.");
		System.out.println("2.) No.");
		itemChoice = input.nextInt();

		if (itemChoice == 1 && gold >= 10) {
			System.out.println("alright, you are fully rested. See you later!");
			hp = maxHp;
			spell1Uses = spell1Max;
			spell2Uses = spell2Max;
			spell3Uses = spell3Max;
			gold = gold - 10;
			innRest = true;
		} else if (itemChoice == 2) {
			System.out.println("Okay, mabye some other time.");
		} else {
			System.out.println("Sorry, but you don't have enough money.");
		}
		spellData();
	}

	static void magicTrader() {
		int itemChoice;
		int purchase;
		Scanner input = new Scanner(System.in);

		System.out
				.println("Welcome to the magic trader! What would you like to purchase?");
		do {
			System.out.println("1.)Rage: increases dmg : uses=2");
			System.out.println("2.)Fireball: 6 dmg: uses=3");
			System.out.println("3.)Magic Missile: 4 dmg: uses=4");
			System.out.println("4.)Meteor Mash: 10 dmg: uses=2");
			System.out.println("5.)Exit magic trader.");
			itemChoice = input.nextInt();
			if (itemChoice == 1) {
				System.out.println("Spell: Rage");
				System.out.println("Increases Damage");
				System.out.println("Uses: 2");
				System.out.println("Cost: 40");
				System.out.println(name + "'s Gold: " + gold);
				System.out
						.println("Do you wish to still buy this spell? 1)yes 2)no");
				purchase = input.nextInt();
				if (purchase == 1) {
					if (spellSlot2 == 0 || spellSlot3 == 0) {
						if (spellSlot2 == 0) {
							spellSlot2 = 1;
							gold = gold - 75;
							spellData();
						} else if (spellSlot2 > 0 && spellSlot3 == 0) {
							spellSlot3 = 1;
							gold = gold - 75;
							spellData();
						}
					} else if (spellSlot2 > 0 && spellSlot3 > 0) {
						System.out
								.println("All spell slots are taken, choose a spell to replace");
						System.out.println("Slot 1: " + spellName1 + " (1)");
						System.out.println("Slot 2: " + spellName2 + " (2)");
						System.out.println("Slot 3: " + spellName3 + " (3)");
						System.out.println("(4) nevermind");
						int replace = input.nextInt();
						if (replace == 1) {
							spellSlot1 = 1;
							gold = gold - 75;
							spellData();
						} else if (replace == 2) {
							spellSlot2 = 1;
							gold = gold - 75;
							spellData();
						} else if (replace == 3) {
							spellSlot3 = 1;
							gold = gold - 75;
							spellData();
						}
					}
				}

			} else if (itemChoice == 2) {
				System.out.println("Spell: Fireball");
				System.out.println("6 dmg");
				System.out.println("Uses: 3");
				System.out.println("Cost: 40");
				System.out.println(name + "'s Gold: " + gold);
				System.out
						.println("Do you wish to still buy this spell? 1)yes 2)no");
				purchase = input.nextInt();
				if (purchase == 1) {
					if (spellSlot2 == 0 || spellSlot3 == 0) {
						if (spellSlot2 == 0) {
							spellSlot2 = 2;
							gold = gold - 40;
							spellData();
						} else if (spellSlot2 > 0 && spellSlot3 == 0) {
							spellSlot3 = 2;
							gold = gold - 40;
							spellData();
						}
					} else if (spellSlot2 > 0 && spellSlot3 > 0) {
						System.out
								.println("All spell slots are taken, choose a spell to replace");
						System.out.println("Slot 1: " + spellName1 + " (1)");
						System.out.println("Slot 2: " + spellName2 + " (2)");
						System.out.println("Slot 3: " + spellName3 + " (3)");
						System.out.println("(4) nevermind");
						int replace = input.nextInt();
						if (replace == 1) {
							spellSlot1 = 2;
							gold = gold - 40;
							spellData();
						} else if (replace == 2) {
							spellSlot2 = 2;
							gold = gold - 40;
							spellData();
						} else if (replace == 3) {
							spellSlot3 = 2;
							gold = gold - 40;
							spellData();
						}
					}
				}
			} else if (itemChoice == 3) {
				System.out.println("Spell: Magic Missle");
				System.out.println("4 dmg");
				System.out.println("Uses: 3");
				System.out.println("Cost: 40");
				System.out.println(name + "'s Gold: " + gold);
				System.out
						.println("Do you wish to still buy this spell? 1)yes 2)no");
				purchase = input.nextInt();
				if (purchase == 1) {
					if (spellSlot2 == 0 || spellSlot3 == 0) {
						if (spellSlot2 == 0) {
							spellSlot2 = 3;
							gold = gold - 40;
							spellData();
						} else if (spellSlot2 > 0 && spellSlot3 == 0) {
							spellSlot3 = 3;
							gold = gold - 40;
							spellData();
						}
					} else if (spellSlot2 > 0 && spellSlot3 > 0) {
						System.out
								.println("All spell slots are taken, choose a spell to replace");
						System.out.println("Slot 1: " + spellName1 + " (1)");
						System.out.println("Slot 2: " + spellName2 + " (2)");
						System.out.println("Slot 3: " + spellName3 + " (3)");
						System.out.println("(4) nevermind");
						int replace = input.nextInt();
						if (replace == 1) {
							spellSlot1 = 3;
							gold = gold - 40;
							spellData();
						} else if (replace == 2) {
							spellSlot2 = 3;
							gold = gold - 40;
							spellData();
						} else if (replace == 3) {
							spellSlot3 = 3;
							gold = gold - 40;
							spellData();
						}
					}
				}
			} else if (itemChoice == 4) {
				System.out.println("Spell: Meteor Mash");
				System.out.println("10 dmg");
				System.out.println("Uses: 2");
				System.out.println("Cost: 100");
				System.out.println(name + "'s Gold: " + gold);
				System.out
						.println("Do you wish to still buy this spell? 1)yes 2)no");
				purchase = input.nextInt();
				if (purchase == 1) {
					if (spellSlot2 == 0 || spellSlot3 == 0) {
						if (spellSlot2 == 0) {
							spellSlot2 = 4;
							gold = gold - 100;
							spellData();
						} else if (spellSlot2 > 0 && spellSlot3 == 0) {
							spellSlot3 = 4;
							gold = gold - 100;
							spellData();
						}
					} else if (spellSlot2 > 0 && spellSlot3 > 0) {
						System.out
								.println("All spell slots are taken, choose a spell to replace");
						System.out.println("Slot 1: " + spellName1 + " (1)");
						System.out.println("Slot 2: " + spellName2 + " (2)");
						System.out.println("Slot 3: " + spellName3 + " (3)");
						System.out.println("(4) nevermind");
						int replace = input.nextInt();
						if (replace == 1) {
							spellSlot1 = 4;
							gold = gold - 100;
							spellData();
						} else if (replace == 2) {
							spellSlot2 = 4;
							gold = gold - 100;
							spellData();
						} else if (replace == 3) {
							spellSlot3 = 4;
							gold = gold - 100;
							spellData();
						}
					}
				}
			}

		} while (itemChoice != 5);
	}

	static void followFind() {
		Scanner input = new Scanner(System.in);
		Random randomName = new Random();
		Random randomStats = new Random();
		String name1 = "";
		String name2 = "";
		int look = 0;

		while (look == 0) {
			int namePart1 = randomName.nextInt(14);
			int namePart2 = randomName.nextInt(13);

			switch (namePart1) {
			case 0:
				name1 = "Korey ";
				break;
			case 1:
				name1 = "Scot ";
				break;
			case 2:
				name1 = "Dick ";
				break;
			case 3:
				name1 = "Jerrod ";
				break;
			case 4:
				name1 = "Olin ";
				break;
			case 5:
				name1 = "Luba ";
				break;
			case 6:
				name1 = "Aletha ";
				break;
			case 7:
				name1 = "Mazie ";
				break;
			case 8:
				name1 = "Kirby ";
				break;
			case 9:
				name1 = "Estell ";
				break;
			case 10:
				name1 = "Bubba";
				break;
			case 11:
				name1 = "Grips";
				break;
			case 12:
				name1 = "Snips";
				break;
			case 13:
				name1 = "Drips";
				break;
			}
			switch (namePart2) {
			case 0:
				name2 = "Tremblay";
				break;
			case 1:
				name2 = "Warfield";
				break;
			case 2:
				name2 = "Handy";
				break;
			case 3:
				name2 = "Rader";
				break;
			case 4:
				name2 = "Whitemire";
				break;
			case 5:
				name2 = "Gatlin";
				break;
			case 6:
				name2 = "Jack";
				break;
			case 7:
				name2 = "Romeo";
				break;
			case 8:
				name2 = "Addison";
				break;
			case 9:
				name2 = "Coons";
				break;
			case 10:
				name2 = "McCain";
				break;
			case 11:
				name2 = "the drunkard";
				break;
			case 12:
				name2 = "Fingledongs";
				break;
			/*case 13:
				name2 = "the sex machine";
				break;*/
			}
			String followerName = name1 + name2;
			int followerAttack, followerDefence, followerHp;
			followerAttack = randomStats.nextInt(11);
			if (followerAttack < 4) {
				followerAttack = 4;
			}
			followerDefence = randomStats.nextInt(15);
			if (followerDefence < 2) {
				followerDefence = 2;
			}
			followerHp = randomStats.nextInt(21);
			if (followerHp < 10) {
				followerHp = 10;
			}
			int followerCost = followerHp + (followerDefence * 2)
					+ followerAttack;
			System.out.println("Follower: " + followerName);
			System.out.println("Attack: " + followerAttack);
			System.out.println("Defence: " + followerDefence);
			System.out.println("HP: " + followerHp);
			System.out.println("Cost of Hireing: " + followerCost
					+ " Would you like to buy 1.)yes 2.)no");
			look = input.nextInt();
			if (look == 1 && gold >= followerCost) {
				if (follow1 == 0) {
					followName1 = followerName;
					followAtk1 = followerAttack;
					followDef1 = followerDefence;
					followHp1 = followerHp;
					follow1 = 1;
					gold = gold - followerCost;
					System.out.println("You hired " + followName1);
					System.out.println("Enter any number to continue...");
					int cont = input.nextInt();
				} else if (follow1 == 1 && follow2 == 0) {
					followName2 = followerName;
					followAtk2 = followerAttack;
					followDef2 = followerDefence;
					followHp2 = followerHp;
					follow2 = 1;
					gold = gold - followerCost;
					System.out.println("You hired " + followName2);
					System.out.println("Enter any number to continue...");
					int cont = input.nextInt();
				} else if (follow1 == 1 && follow2 == 1) {
					int again = 0;

					while (again == 0) {
						System.out.println("Both follower slots are taken!");
						System.out
								.println("Would you like to replace a follower?");
						System.out.println("1.) " + followName1);
						System.out.println("2.) " + followName2);
						System.out
								.println("3.) Dont replace(will still uses up a search)");
						int replace = input.nextInt();
						if (replace == 1) {
							System.out.println("Name: " + followName1);
							System.out.println("Attack: " + followAtk1);
							System.out.println("Defence: " + followDef1);
							System.out.println("Hp: " + followHp1);
							System.out.println("Are you sure?1.)yes 2.)no");
							int foller = input.nextInt();
							if (foller == 1) {
								followName1 = followerName;
								followAtk1 = followerAttack;
								followDef1 = followerDefence;
								followHp1 = followerHp;
								follow1 = 1;
								gold = gold - followerCost;
								System.out.println("You hired " + followName1);
								System.out
										.println("Enter any number to continue...");
								int cont = input.nextInt();
								again = 1;
							}
						} else if (replace == 2) {
							System.out.println("Name: " + followName2);
							System.out.println("Attack: " + followAtk2);
							System.out.println("Defence: " + followDef2);
							System.out.println("Hp: " + followHp2);
							System.out.println("Are you sure?1.)yes 2.)no");
							int foller = input.nextInt();
							if (foller == 1) {
								followName2 = followerName;
								followAtk2 = followerAttack;
								followDef2 = followerDefence;
								followHp2 = followerHp;
								follow2 = 1;
								gold = gold - followerCost;
								System.out.println("You hired " + followName2);
								System.out
										.println("Enter any number to continue...");
								int cont = input.nextInt();
								again = 1;
							}

						} else if (replace == 3) {
							System.out.println("To bad, mabye next time");
							System.out
									.println("Enter any number to continue...");
							int cont = input.nextInt();
							again = 1;
						}
					}
				}
			}

		}

	}

	static void save() {
		PrintWriter Save = null;

		try {
			Save = new PrintWriter(save);
		} catch (Exception a) {
		}

		for (int i = 0; i < 25; i++) {
			if (i == 0) {
				Save.println(name);
			} else if (i == 1) {
				Save.println(gold);
			} else if (i == 2) {
				Save.println(spellSlot1);
			} else if (i == 3) {
				Save.println(spellSlot2);
			} else if (i == 4) {
				Save.println(spellSlot3);
			} else if (i == 5) {
				Save.println(spell1Uses);
			} else if (i == 6) {
				Save.println(spell2Uses);
			} else if (i == 7) {
				Save.println(spell3Uses);
			} else if (i == 8) {
				Save.println(attk);
			} else if (i == 9) {
				Save.println(armr);
			} else if (i == 10) {
				Save.println(hp);
			} else if (i == 11) {
				Save.println(maxHp);
			} else if (i == 12) {
				Save.println(exp);
			} else if (i == 13) {
				Save.println(maxExp);
			} else if (i == 14) {
				Save.println(lvl);
			} else if (i == 15) {
				Save.println(follow1);
			} else if (i == 16) {
				Save.println(follow2);
			} else if (i == 17) {
				Save.println(followName1);
			} else if (i == 18) {
				Save.println(followName2);
			} else if (i == 19) {
				Save.println(followAtk1);
			} else if (i == 20) {
				Save.println(followAtk2);
			} else if (i == 21) {
				Save.println(followDef1);
			} else if (i == 22) {
				Save.println(followDef2);
			} else if (i == 23) {
				Save.println(followHp1);
			} else if (i == 24) {
				Save.println(followHp2);
			}
		}
		Save.close();
	}

	static void lvlUp() {
		if (exp >= maxExp) {
			lvl++;
			System.out.println("You leveled up to lvl " + lvl + ".");
			maxHp = maxHp + 5;
			hp = maxHp;
			maxExp = maxExp + maxExpIncrease;
			maxExpIncrease = maxExpIncrease + 5;
		}
	}

}