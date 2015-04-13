import java.util.*;
public class greek {
	static int one=0;
	static int two=0;
	static int three=0;
	static int four=0;
	static int five=0;
	static int times=0;
	static int again=1;
	static String agin="y";

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		do {System.out.println("Enter 1-5, enter 0 when done");
		int rate=-1;
		
			while(rate != 0){
				rate = input.nextInt();
					if(rate==1){
						one++;
					}
					else if(rate==2){
						two++;
					}
					else if(rate==3){
						three++;
					}
					else if(rate==4){
						four++;
					}
					else if(rate==5){
						five++;
					}
				if(rate>=1&&rate<=5){
					times=times+1;
				}
					
					
				
			}
			
			
			System.out.print("5 ("+five+") |");
			 	for(int a=0; a<five;a++){
			 		System.out.print("=");
			 }
			 	System.out.println("");
			 System.out.print("4 ("+four+") |");
			 	for(int a=0; a<four;a++){
			 		System.out.print("=");
			 }
			 	System.out.println("");
			 System.out.print("3 ("+three+") |");
				 for(int a=0; a<three;a++){
				 	System.out.print("=");
				 }
				 System.out.println("");
			System.out.print("2 ("+two+") |");
				 for(int a=0; a<two;a++){
				 	System.out.print("=");
				 }
				 System.out.println("");
			System.out.print("1 ("+one+") |");
				 for(int a=0; a<one;a++){
				 	System.out.print("=");
				 }
				 System.out.println("");
				int fivetot,fourtot,threetot,twotot,onetot;
				fivetot=5*five;
				fourtot=4*four;
				threetot=3*three;
				twotot=2*two;
				onetot=1*one;
				
				 double total=fivetot+fourtot+threetot+twotot+onetot;
					double avarage=total/times;
				 System.out.println("Average rating: "+avarage);
				 one=0;two=0;three=0;four=0;five=0;total=0;avarage=0;fivetot=0;fourtot=0;threetot=0;twotot=0;onetot=0;times=0;
				 System.out.println("Would you like to rate again?(1.y/2.n)");
				 again=input.nextInt();
				
				
		}while(again==1);
				

	}

}
