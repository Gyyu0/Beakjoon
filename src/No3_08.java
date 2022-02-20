import java.util.Scanner;

public class No3_08 {

	public static void main(String[] args) {
		Scanner P = new Scanner(System.in);
		
		int C = P.nextInt();
		
		for(int i = 1; i <= C; i++) {
			int A = P.nextInt();
			int B = P.nextInt();
			
			System.out.println("Case #" + i + ": " + A + " + " + B + " = "+ (A+B) );
		}	P.close();
		
	}

}
