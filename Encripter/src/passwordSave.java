import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class passwordSave {
	public static void saver() {
		int cont = 0;
		Scanner input = new Scanner(System.in);
		String i = "", h = "";
		System.out.println("Enter a password for the encryption");
		String password = input.nextLine();
		password = password.replace("1", "~").replace("2", "`").replace("3", "!")
				.replace("4", "@").replace("5", "#").replace("6", "$")
				.replace("7", "%").replace("8", "^").replace("9", "&")
				.replace("0", "*").replace("q", "(").replace("w", ")")
				.replace("e", "-").replace("r", "=").replace("t", "_")
				.replace("y", "+").replace("u", "[").replace("i", "]")
				.replace("o", "{").replace("p", "}").replace("a", ";")
				.replace("s", ":").replace("d", "'").replace("f", ",")
				.replace("g", "<").replace("h", ".").replace("j", ">")
				.replace("k", "?").replace("l", "/").replace("z", "\\")
				.replace("x", "|").replace("c", "3").replace("v", "2")
				.replace("b", "5").replace("n", "8").replace("m", "6")
				.replace(" ", "\"");

		password = password.replace("~", "y").replace("`", "t").replace("!", "u")
				.replace("@", "r").replace("#", "i").replace("$", "e")
				.replace("%", "o").replace("^", "w").replace("&", "p")
				.replace("*", "q").replace("(", "h").replace(")", "g")
				.replace("-", "j").replace("_", "d").replace("+", "k")
				.replace("=", "s").replace("[", "l").replace("]", "a")
				.replace("{", "b").replace("}", "v").replace(";", "n")
				.replace(":", "c").replace("'", "x").replace(",", "m")
				.replace("<", "z").replace(">", "1").replace(".", "4")
				.replace("?", "7").replace("/", "9").replace("\\", "0")
				.replace("|", "\\").replace("3", "}").replace("2", "'")
				.replace("5", "<").replace("8", "?").replace("6", ";");
		while (cont == 0) {
			System.out.println("Enter the thing to be encrypted");
			i = input.nextLine();
			h = i.toLowerCase();

			int q = i.length();
			for (int t = 0; t < q; t++) {
				if (h.substring(t, t + 1).equals("1")
						|| h.substring(t, t + 1).equals("2")
						|| h.substring(t, t + 1).equals("3")
						|| h.substring(t, t + 1).equals("4")
						|| h.substring(t, t + 1).equals("5")
						|| h.substring(t, t + 1).equals("6")
						|| h.substring(t, t + 1).equals("7")
						|| h.substring(t, t + 1).equals("8")
						|| h.substring(t, t + 1).equals("9")
						|| h.substring(t, t + 1).equals("0")
						|| h.substring(t, t + 1).equals("q")
						|| h.substring(t, t + 1).equals("w")
						|| h.substring(t, t + 1).equals("e")
						|| h.substring(t, t + 1).equals("r")
						|| h.substring(t, t + 1).equals("t")
						|| h.substring(t, t + 1).equals("y")
						|| h.substring(t, t + 1).equals("u")
						|| h.substring(t, t + 1).equals("h")
						|| h.substring(t, t + 1).equals("o")
						|| h.substring(t, t + 1).equals("p")
						|| h.substring(t, t + 1).equals("a")
						|| h.substring(t, t + 1).equals("s")
						|| h.substring(t, t + 1).equals("d")
						|| h.substring(t, t + 1).equals("f")
						|| h.substring(t, t + 1).equals("g")
						|| h.substring(t, t + 1).equals("i")
						|| h.substring(t, t + 1).equals("j")
						|| h.substring(t, t + 1).equals("k")
						|| h.substring(t, t + 1).equals("l")
						|| h.substring(t, t + 1).equals("z")
						|| h.substring(t, t + 1).equals("x")
						|| h.substring(t, t + 1).equals("c")
						|| h.substring(t, t + 1).equals("v")
						|| h.substring(t, t + 1).equals("b")
						|| h.substring(t, t + 1).equals("n")
						|| h.substring(t, t + 1).equals("m")) {
					cont = 1;
				}
			}
			if (cont == 0) {
				System.out.println("invalid characters");
			}
		}
		String file = "encrypted";
		PrintWriter File = null;
		try {
			File = new PrintWriter(new FileWriter(file, true));
		} catch (Exception a) {
			System.out.println("nope");
			System.exit(0);
		}
		String files = "encrypted";
		PrintWriter Files = null;
		try {
			Files = new PrintWriter((files));
		} catch (Exception a) {
			System.out.println("nope");
			System.exit(0);
		}
		Files.println("");
		h = h.replace("1", "~").replace("2", "`").replace("3", "!")
				.replace("4", "@").replace("5", "#").replace("6", "$")
				.replace("7", "%").replace("8", "^").replace("9", "&")
				.replace("0", "*").replace("q", "(").replace("w", ")")
				.replace("e", "-").replace("r", "=").replace("t", "_")
				.replace("y", "+").replace("u", "[").replace("i", "]")
				.replace("o", "{").replace("p", "}").replace("a", ";")
				.replace("s", ":").replace("d", "'").replace("f", ",")
				.replace("g", "<").replace("h", ".").replace("j", ">")
				.replace("k", "?").replace("l", "/").replace("z", "\\")
				.replace("x", "|").replace("c", "3").replace("v", "2")
				.replace("b", "5").replace("n", "8").replace("m", "6")
				.replace(" ", "\"");

		h = h.replace("~", "y").replace("`", "t").replace("!", "u")
				.replace("@", "r").replace("#", "i").replace("$", "e")
				.replace("%", "o").replace("^", "w").replace("&", "p")
				.replace("*", "q").replace("(", "h").replace(")", "g")
				.replace("-", "j").replace("_", "d").replace("+", "k")
				.replace("=", "s").replace("[", "l").replace("]", "a")
				.replace("{", "b").replace("}", "v").replace(";", "n")
				.replace(":", "c").replace("'", "x").replace(",", "m")
				.replace("<", "z").replace(">", "1").replace(".", "4")
				.replace("?", "7").replace("/", "9").replace("\\", "0")
				.replace("|", "\\").replace("3", "}").replace("2", "'")
				.replace("5", "<").replace("8", "?").replace("6", ";");

		File.println(password);
		File.println(h);
		File.close();
	}
}
