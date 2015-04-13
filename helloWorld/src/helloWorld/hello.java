package helloWorld;
import java.util.Scanner;
public class hello {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Scanner numInput=new Scanner(System.in);
		System.out.println("Enter your name");
		
		String name = input.nextLine();
		System.out.println("Hello "+name);
		System.out.println("What is your age?");
		int numTwo = numInput.nextInt();
		int numOne = 10;
		int total=numOne+numTwo;
		
		System.out.println("In 10 years "+name+" will be "+total+" years old");
	}

}
