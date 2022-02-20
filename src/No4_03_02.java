import java.util.Scanner;

public class No4_03_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = N;
		in.close();
		
		while(true) {
			a = (N/10) + (N%10);
			b = ((N%10)*10) + (a%10);
			c++;
			if(b == d) {
				System.out.println(c);
				break;
			}else {
			N = b;
			}
		}

	}

}
