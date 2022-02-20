import java.util.Scanner;

public class No3_02_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int box[] = new int [T];
				
			for(int i = 0; i < T; i++) {
				int A = in.nextInt();
				int B = in.nextInt();
				box[i] = A + B;
			}
		in.close();
		for(int k : box) {
			System.out.println(k);
		}
	}

}
