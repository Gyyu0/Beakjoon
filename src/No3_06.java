import java.util.Scanner;

public class No3_06 {

	public static void main(String[] args) {
		Scanner P = new Scanner(System.in);
		
		int N = P.nextInt();
		
		for(int i = 0; i<N; i++) {
			System.out.println(N-i);
		}
		P.close();

	}

}
