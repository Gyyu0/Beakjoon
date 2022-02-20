import java.util.Scanner;

public class No3_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		for(int i = 1; i<=N; i++) {
			for(int k = 1; k <= N-i; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
