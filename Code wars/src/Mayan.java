import java.util.*;

public class Mayan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a date(MM/DD/YYYY)");
		String date = "";
		date = input.nextLine();
		String holder[] = {};
		holder = new String[3];
		holder = date.split("/");
		int month = 0;
		month = Integer.parseInt(holder[0]);
		month = month - 1;
		int days = 0;
		days = Integer.parseInt(holder[1]);
		for (int i = 1; i <= month; i++) {
			// System.out.println(i);
			if (i == 1) {
				days = days + 31;
			} else if (i == 2) {
				days = days + 28;
			} else if (i == 3) {
				days = days + 31;
			} else if (i == 4) {
				days = days + 30;
			} else if (i == 5) {
				days = days + 31;
			} else if (i == 6) {
				days = days + 30;
			} else if (i == 7) {
				days = days + 31;
			} else if (i == 8) {
				days = days + 31;
			} else if (i == 9) {
				days = days + 30;
			} else if (i == 10) {
				days = days + 31;
			} else if (i == 11) {
				days = days + 30;
			}
		}

		double year = 0, yearCheck = 0;
		int yearAgain = 0,yearDif=0;
		year = Double.parseDouble(holder[2]);
		yearCheck = year / 4;
		yearAgain = (int) Math.round(yearCheck);
		if (yearAgain == yearCheck) {
			days = days + 1;
		}
		int kin = 0, unial = 0, tun = 0, katun = 0, baktun = 0;
		yearDif=(int) (year-1);
		for(double i=1;i<=yearDif+3114;i++){
			double hoooo=0;
			int num=0;
			days=days+365;
			hoooo = i / 4;
			num = (int) Math.round(hoooo);
			if (hoooo == num) {
				
				days = days + 1;
			}
			
		}
		//days=days+54;
		days=days-264;
		kin = days;
		while (kin >= 20) {
			kin = kin - 20;
			unial++;
		}
		while (unial >= 18) {
			unial = unial - 18;
			tun++;
		}
		while (tun >= 20) {
			tun = tun - 20;
			katun++;
		}
		while (katun >= 20) {
			katun = katun - 20;
			baktun++;
		}
		System.out.println(baktun + "." + katun + "." + tun + "." + unial + "."
				+ kin);

	}

}
