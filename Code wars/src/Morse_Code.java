import java.util.*;

public class Morse_Code {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arraysize = 0;
		String words[] = {};
		String holder[] = {};
		boolean farse = false;
		do {
			String things = input.nextLine();
			if (!things.equals(".")) {
				arraysize++;
				holder = words;
				words = new String[arraysize];
				for (int x = 0; x < arraysize - 1; x++) {
					words[x] = holder[x];
				}
				words[words.length - 1] = things;
			} else {
				farse = true;
			}

		} while (farse == false);
		String stuff = "";
		String ruff="";
		String buff="";
		String fluff="";
		
		
		for (int x = 0; x < arraysize; x++) {
			stuff = words[x];
			fluff=stuff.replace(" ", "");
			
			ruff=fluff.replace("A",".-").replace("B","-...").replace("C","-.-.").replace("D","-..").replace("E",".").replace("F","..-.").replace("G","--.").replace("H","....").replace("I","..").replace("J",".---").replace("K","-.-").replace("L",".-..").replace("M","--").replace("N","-.").replace("O","---").replace("P",".--.").replace("Q","--.-").replace("R",".-.").replace("S","...").replace("T","-").replace("U","..-").replace("V","...-").replace("W",".--").replace("X","-..-").replace("Y","-.--").replace("Z","--..");
			
			buff = new StringBuilder(ruff).reverse().toString();
			
			if(buff.equals(ruff)){
				System.out.println(stuff+" is a MCP");
			}else{
				System.out.println(stuff+" is *not* a MCP");
			}
			
		}

	}
}
