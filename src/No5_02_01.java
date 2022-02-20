import java.util.Scanner;

public class No5_02_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = 9;
		int[] arr = new int[N];
		
		for(int Loop1 = 0; Loop1 < N; Loop1++) {
			arr[Loop1] = in.nextInt(); 
		}
		in.close();
		int Max = 0;
		int Lank = 0;
		
		for(int Loop1 = 0; Loop1 < N; Loop1++) {
			if(Max < arr[Loop1]) {
				Max = arr[Loop1];
			}
			if(Max == arr[Loop1]) {
				Lank = Loop1;
			}		
		}
		System.out.println(Max);
		System.out.println(Lank+1);
	}

}
