import java.util.Random;
import java.util.Scanner;

public class namer {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int cons, vowel;
		double times = 0;
		int rounded = 0;
		String consonet = "", vowels = "", name = "";
		System.out.println("How many letters will the name be?(max is 10)");
		double letters = input.nextInt();
		if (letters > 10) {
			letters = 10;
		}
		letters = letters + 0.5;
		times = letters / 2;
		rounded = (int) Math.round(times);
		int limiter = 0;
		for (int i = 0; i < rounded; i++) {
			cons = random.nextInt(21);
			vowel = random.nextInt(4);
			limiter++;

			if (cons == 0) {
				consonet = "b";
			}
			if (cons == 1) {
				consonet = "c";
			}
			if (cons == 2) {
				consonet = "d";
			}
			if (cons == 3) {
				consonet = "f";
			}
			if (cons == 4) {
				consonet = "g";
			}
			if (cons == 5) {
				consonet = "h";
			}
			if (cons == 6) {
				consonet = "j";
			}
			if (cons == 7) {
				consonet = "k";
			}
			if (cons == 8) {
				consonet = "l";
			}
			if (cons == 9) {
				consonet = "m";
			}
			if (cons == 10) {
				consonet = "n";
			}
			if (cons == 11) {
				consonet = "p";
			}
			if (cons == 12) {
				consonet = "q";
			}
			if (cons == 13) {
				consonet = "r";
			}
			if (cons == 14) {
				consonet = "s";
			}
			if (cons == 15) {
				consonet = "t";
			}
			if (cons == 16) {
				consonet = "v";
			}
			if (cons == 17) {
				consonet = "w";
			}
			if (cons == 18) {
				consonet = "x";
			}
			if (cons == 19) {
				consonet = "y";
			}
			if (cons == 20) {
				consonet = "z";
			}
			name = name + consonet;
			System.out.println(limiter+" "+rounded);
			if (limiter < rounded) {
				if (vowel == 0) {
					vowels = "a";
				}
				if (vowel == 1) {
					vowels = "e";
				}
				if (vowel == 2) {
					vowels = "i";
				}
				if (vowel == 3) {
					vowels = "o";
				}
				if (vowel == 4) {
					vowels = "u";
				}
				name = name + vowels;
			} else if (limiter == rounded) {
				if (rounded == 3) {
				} else if (rounded == 5) {
					vowel = random.nextInt(4);
					if (vowel == 0) {
						vowels = "a";
					}
					if (vowel == 1) {
						vowels = "e";
					}
					if (vowel == 2) {
						vowels = "i";
					}
					if (vowel == 3) {
						vowels = "o";
					}
					if (vowel == 4) {
						vowels = "u";
					}
					name = name + vowels;

				} else if (rounded == 3) {
					vowel = random.nextInt(4);
					if (vowel == 0) {
						vowels = "a";
					}
					if (vowel == 1) {
						vowels = "e";
					}
					if (vowel == 2) {
						vowels = "i";
					}
					if (vowel == 3) {
						vowels = "o";
					}
					if (vowel == 4) {
						vowels = "u";
					}
					name = name + vowels;
				} else if (rounded == 1) {
					vowel = random.nextInt(4);
					if (vowel == 0) {
						vowels = "a";
					}
					if (vowel == 1) {
						vowels = "e";
					}
					if (vowel == 2) {
						vowels = "i";
					}
					if (vowel == 3) {
						vowels = "o";
					}
					if (vowel == 4) {
						vowels = "u";
					}
					name = name + vowels;
				} else if ((rounded % 2) == 0) {
					vowel = random.nextInt(4);
					if (vowel == 0) {
						vowels = "a";
					}
					if (vowel == 1) {
						vowels = "e";
					}
					if (vowel == 2) {
						vowels = "i";
					}
					if (vowel == 3) {
						vowels = "o";
					}
					if (vowel == 4) {
						vowels = "u";
					}
					name = name + vowels;
				} else {

				}
			}

		}
		System.out.println(name);

	}

}
