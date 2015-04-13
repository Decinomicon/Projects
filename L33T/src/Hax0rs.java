import java.util.*;

public class Hax0rs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a phrase");
			String phrase = input.nextLine();
			phrase.toLowerCase();
			for (int i = 0; i < 50; i++) {
				System.out.println(" ");
			}
			System.out.println(phrase.replace("a", "@").replace("b", "8")
					.replace("c", "(").replace("d", "|)").replace("e", "3")
					.replace("f", "|=").replace("g", "6").replace("h", "#")
					.replace("i", "!").replace("j", "_|").replace("k", "|{")
					.replace("l", "|_").replace("m", "|\\/|")
					.replace("n", "|\\|").replace("o", "0").replace("p", "|2")
					.replace("q", "(,)").replace("r", "|?").replace("s", "$")
					.replace("t", "7").replace("u", "|_|").replace("v", "|/")
					.replace("w", "\\/\\/").replace("x", "}{")
					.replace("y", "'/").replace("z", "(\\)"));
		}
	}

}
