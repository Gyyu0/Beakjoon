import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int[] arr = new int[a];
		int b = 1;
		
		for(int i = 0; i<a; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		for(int i = 0; i<a; i++) {
			b = b * arr[i];
		}
		System.out.println(b);
		int count = 0;
		for(int i = 1; i<=100; i++) {
			count = b/i;
			if (count > 0) {
				System.out.print(count + " ");
			}
		}
		}

	}

