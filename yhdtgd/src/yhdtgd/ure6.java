package yhdtgd;
import java.util.Random;
public class ure6 {

	public static void main(String[] args) {
		Random random=new Random();
		for (int i=0; i<20;i++){
			int numbers=random.nextInt(16);//makes the random number
			
			System.out.println(numbers);//prints out the number
		}

	}

}
