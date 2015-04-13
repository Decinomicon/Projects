import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class psasswordEnter {
	public static void enterer() {
		Scanner input = new Scanner(System.in);
		Scanner shoop = null;
		String password = "", decrypte = "";
		int cont = 0;
		String file = "encripted";
		System.out.println("Enter the password");
		String guess = input.nextLine();

		try {
			shoop = new Scanner(new File(file));
		} catch (Exception e) {
			System.out.println("Whoops");
			System.exit(0);
		}
		int yolo = 0;
		while (shoop.hasNextLine()) {
			if (cont == 0) {
				password = shoop.nextLine();
				cont++;
				password = password.replace("y", "~").replace("t", "`")
						.replace("u", "!").replace("r", "@").replace("i", "#")
						.replace("e", "$").replace("o", "%").replace("w", "^")
						.replace("p", "&").replace("q", "*").replace("h", "(")
						.replace("g", ")").replace("j", "-").replace("d", "_")
						.replace("k", "+").replace("s", "=").replace("l", "[")
						.replace("a", "]").replace("b", "{").replace("v", "}")
						.replace("n", ";").replace("c", ":").replace("x", "'")
						.replace("m", ",").replace("z", "<").replace("1", ">")
						.replace("4", ".").replace("7", "?").replace("9", "/")
						.replace("0", "\\").replace("\\", "|")
						.replace("}", "3").replace("'", "2").replace("<", "5")
						.replace("?", "8").replace(";", "6");
				password = password.replace("~", "1").replace("`", "2")
						.replace("!", "3").replace("@", "4").replace("#", "5")
						.replace("$", "6").replace("%", "7").replace("^", "8")
						.replace("&", "9").replace("*", "0").replace("(", "q")
						.replace(")", "w").replace("-", "e").replace("=", "r")
						.replace("_", "t").replace("+", "y").replace("[", "u")
						.replace("]", "i").replace("{", "o").replace("}", "p")
						.replace(";", "a").replace(":", "s").replace("'", "d")
						.replace(",", "f").replace("<", "g").replace(".", "h")
						.replace(">", "j").replace("?", "k").replace("/", "l")
						.replace("\\", "z").replace("|", "x").replace("3", "c")
						.replace("2", "v").replace("5", "b").replace("8", "n")
						.replace("6", "m").replace("\"", " ");
				if (guess.equals(password)) {
					System.out.println("Correct password");
				} else {
					System.out.println("Wrong password fool");
					System.out.println(password);
					String files = "encrypted";
					System.out.println();
					PrintWriter Files = null;
					try {
						Files = new PrintWriter((files));
					} catch (Exception a) {
						System.out.println("nope");
						System.exit(0);
					}
					Files.println("");
				}
			}
			if (yolo == 1) {
				decrypte = shoop.nextLine();
				decrypte = decrypte.replace("y", "~").replace("t", "`")
						.replace("u", "!").replace("r", "@").replace("i", "#")
						.replace("e", "$").replace("o", "%").replace("w", "^")
						.replace("p", "&").replace("q", "*").replace("h", "(")
						.replace("g", ")").replace("j", "-").replace("d", "_")
						.replace("k", "+").replace("s", "=").replace("l", "[")
						.replace("a", "]").replace("b", "{").replace("v", "}")
						.replace("n", ";").replace("c", ":").replace("x", "'")
						.replace("m", ",").replace("z", "<").replace("1", ">")
						.replace("4", ".").replace("7", "?").replace("9", "/")
						.replace("0", "\\").replace("\\", "|")
						.replace("}", "3").replace("'", "2").replace("<", "5")
						.replace("?", "8").replace(";", "6");
				decrypte = decrypte.replace("~", "1").replace("`", "2")
						.replace("!", "3").replace("@", "4").replace("#", "5")
						.replace("$", "6").replace("%", "7").replace("^", "8")
						.replace("&", "9").replace("*", "0").replace("(", "q")
						.replace(")", "w").replace("-", "e").replace("=", "r")
						.replace("_", "t").replace("+", "y").replace("[", "u")
						.replace("]", "i").replace("{", "o").replace("}", "p")
						.replace(";", "a").replace(":", "s").replace("'", "d")
						.replace(",", "f").replace("<", "g").replace(".", "h")
						.replace(">", "j").replace("?", "k").replace("/", "l")
						.replace("\\", "z").replace("|", "x").replace("3", "c")
						.replace("2", "v").replace("5", "b").replace("8", "n")
						.replace("6", "m").replace("\"", " ");
			}
			yolo++;

		}
		String files = "encrypted";
		PrintWriter Files = null;
		try {
			Files = new PrintWriter((files));
		} catch (Exception a) {
			System.out.println("nope");
			System.exit(0);
		}
		System.out.println(decrypte);

		shoop.close();
	}
}
