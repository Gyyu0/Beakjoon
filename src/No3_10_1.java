import java.util.Scanner;

public class No3_10_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.close();
		
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= n-i; k++ ) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
