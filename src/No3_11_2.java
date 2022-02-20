import java.util.Scanner;

public class No3_11_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int box[] = new int [N];
		int x = in.nextInt();
		
		for(int i = 0; i < N; i++) {
			box[i] = in.nextInt();
			if(box[i] < x) {
				System.out.print(box[i]+" ");
			}
		}in.close();

	}

}
