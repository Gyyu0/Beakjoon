import java.util.Scanner;

public class No3_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int R = 0;
		
		for(int i = 1; i <= n; i++) {
			R = R + i;
		}
		
		System.out.println(R);
		sc.close();

	}

}
