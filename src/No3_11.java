import java.util.Scanner;

public class No3_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int N = in.nextInt();
		int X = in.nextInt();
		int box[] = new int [N];
		
		for(int i = 0; i < N; i++) {
			box[i] = in.nextInt();
			if(box[i] < X) {
				System.out.print(box[i] + " ");
			}
		}in.close();

	}
}