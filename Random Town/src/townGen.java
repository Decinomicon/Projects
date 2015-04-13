import java.util.Random;
import java.util.Scanner;
public class townGen {

	public static void main(String[] args) {
		Random random=new Random();
		Scanner input=new Scanner(System.in);
		String again="";
		do{
		int first;
		int second;
		String halfOne="", halfTwo="";
		first=random.nextInt(5);
		second=random.nextInt(5);
		switch(first){
		case 0:
			halfOne="Hog";
			break;
		case 1:
			halfOne="Dawn";
			break;
		case 2:
			halfOne="Froth";
			break;
		case 3:
			halfOne="Half";
			break;
		case 4:
			halfOne="Win";
			break;
		}
		switch(second){
		case 0:
			halfTwo="town";
			break;
		case 1:
			halfTwo="ville";
			break;
		case 2:
			halfTwo="son";
			break;
		case 3:
			halfTwo="topia";
			break;
		case 4:
			halfTwo="burg";
			break;
		}
		System.out.println("The town name is: "+halfOne+""+halfTwo);
		System.out.println("Enter nothing to do it again");
		again=input.nextLine();
		}while(again.equals(""));

	}

}
