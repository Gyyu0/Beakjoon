import java.util.Scanner;

public class No3_02_01 {

	public static void main(String[] args) {
		Scanner M = new Scanner(System.in);
		
		int C = M.nextInt();
		int box[] = new int [C];	
		
		for(int i = 0; i<C; i++) {
			int A = M.nextInt();
			int B = M.nextInt();
			box[i] = A + B;
		}
		M.close();

		for(int k : box) {
			System.out.println(k);
		}
	}

}
