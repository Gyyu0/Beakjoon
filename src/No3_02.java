import java.util.Scanner;

public class No3_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int box[] = new int[c];
				
		for(int i = 0; i < c; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			box[i] = A + B;
		}
		sc.close(); 	
		
		for(int k : box) {
			System.out.println(k);
		}
	
	}
}
