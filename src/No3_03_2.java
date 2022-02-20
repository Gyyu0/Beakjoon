import java.util.Scanner;

public class No3_03_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int R = 0;
		
		for(int i = 1; i <= n; i++) {
			R = R + i;
		}
		System.out.println(R);
		in.close();

	}

}
