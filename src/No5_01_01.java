import java.util.Arrays;
import java.util.Scanner;

public class No5_01_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for(int Loop1 = 0; Loop1 < N; Loop1++) {
			arr[Loop1] = in.nextInt();
			
		}
		in.close();
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[N - 1]);
	}

}
