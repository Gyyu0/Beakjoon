import java.util.Scanner;

public class No2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(1 <= x && 1 <= y ) {
			System.out.println("1");
		} else if(x <= -1 && 1 <= y ) {
			System.out.println("2"); 
		} else if(x <= -1 && y <= -1) {
			System.out.println("3"); 
		} else if(1 <= x && y <= -1) {
			System.out.println("4"); 
		}
		sc.close();

	}
}
