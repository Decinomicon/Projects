import java.util.Scanner;
public class helloWorld {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name=input.nextLine();
		
		System.out.println("Hello "+name);
		
		System.out.println("Enter your age");
		
		int age=input.nextInt();
		int old=7;
		int totalAge=age+old;
		
		System.out.println("Your age in seven years will be "+totalAge+" years old");

	}

}
