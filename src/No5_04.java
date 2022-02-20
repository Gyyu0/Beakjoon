import java.util.Scanner;

public class No5_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr1 = new int[10];
		boolean[] arr2 = new boolean[42];
		int count = 0;
		
		for(int i = 0; i<10; i++) {
			arr1[i] = in.nextInt();
			arr2[arr1[i]%42] = true;
		}
		in.close();
		
		for(int i = 0; i<arr2.length; i++) {
			if(arr2[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
