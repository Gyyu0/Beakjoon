import java.util.Scanner;

public class No5_02_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i = 0; i < 9; i++) {
			arr[i] = in.nextInt();
		}
		
		in.close();
		int Max = 0;
		int Rank = 0;
		
		for(int i = 0; i<9; i++) {
			if(arr[i] > Max) {
				Max = arr[i];
				Rank = i;
			}
		}
		System.out.println(Max);
		System.out.println(Rank+1);
	}

}
