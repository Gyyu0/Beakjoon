import java.util.Scanner;

public class No2_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt();
		int M = in.nextInt();
		int A = in.nextInt();
		in.close();
		int B = (M + A)/60;
		
		if(M + A < 60) {
			M = M + A;
		}else if(M + A >= 60) {
			M = M + A;
		for(int i = 1; i<=B; i++) {
			M = M - 60;
			H++;
			if(H >= 24) {
				H = 0;
			}
		}
		}
		System.out.println(H + " " + M);

	}

}
