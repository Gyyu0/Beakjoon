import java.util.Arrays;
import java.util.Scanner;

public class No5_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] box = new int[N];
		
		for(int i = 0; i<N; i++) {
			box[i] = in.nextInt();
		} 
		
		in.close();
		Arrays.sort(box);
		System.out.print(box[0] + " " + box[N - 1]);

	}

}
