import java.util.Scanner;

public class No3_03_1 {

	public static void main(String[] args) {
		Scanner M = new Scanner(System.in);
		
		int N = M.nextInt();
		int P = 0;
				
		for(int i = 0; i<=N; i++) {
			P = P + i;
		}
		M.close();
		
		System.out.println(P);

	}

}
