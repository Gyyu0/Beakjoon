import java.util.Scanner;

public class No2_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int D1 = in.nextInt();
		int D2 = in.nextInt();
		int D3 = in.nextInt();
		in.close();
		int G;
		
		if(D1 == D2 && D1 == D3) {
			G = 10000+(1000*D1);
		} else if(D1 == D2 || D1 == D3) {
			G = 1000+(100*D1);
		} else if (D2 == D3) {
			G = 1000+(100*D2);
		} else {
			G = 100*(Math.max(D1, Math.max(D2, D3)));
		}
		System.out.println(G);
	}

}
