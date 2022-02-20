import java.util.Scanner;

public class No2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int leapYear = sc.nextInt();
		
		if(leapYear%4==0) {
			if(leapYear%400==0) System.out.println("1");
			else if(leapYear%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
		
		sc.close();

	}

}
