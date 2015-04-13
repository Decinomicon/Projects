import java.util.*;
public class Palindromes {

	static int numStart=0;
	static int numEnd=0;
	static int num1=0;
	static int num2=0;
	static int halt=0;
	static int steps=-1;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Give a number to start and a number to end");
		
		numStart=input.nextInt();
		numEnd=input.nextInt();
		
		
		
		
		System.out.println("|No.|Steps|palindrome");
		System.out.println("|---|-----|-----------");
		while(numStart<=numEnd){
			palindromy();
			numStart++;
		}

	}
	static void palindromy(){
		if(halt==0){
		num1=numStart;
		halt++;
		}
		steps++;
		num2=num1;
		//System.out.println(num1+" "+num2);
		int reverse=0;
		while(num2 != 0){
		reverse=reverse*10;
		reverse=reverse+num2%10;
		num2=num2/10;
		}
		num2=reverse;
		//System.out.println(num2);
		if(num1!=num2){
			num1=num1+num2;
			//System.out.println(num1);
			palindromy();
		}
		else if(num1==num2){
			halt=0;
			System.out.println("|"+numStart+"|    "+steps+"|"+num1);
			steps=-1;
			num2=0;
		}
	}

}
