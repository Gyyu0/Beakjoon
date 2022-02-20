import java.util.Scanner;

public class No5_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = 9;
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int max = 0;
		int rank = 0;
		for(int i = 0; i<N; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] == max) {
				rank = i;
			}
		}
		System.out.println(max);
		System.out.println(rank+1);

	}

}
