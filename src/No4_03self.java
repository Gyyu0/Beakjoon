import java.util.Scanner;

public class No4_03self {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String N =  in.next();
		in.close();
		int k = 0;
		int a = 0;
		int i = 0;
		
		while(true) {
			if(Integer.parseInt(N) >= 10) {
				k = (N.charAt(0) - '0') + (N.charAt(1) - '0');
				String to = Integer.toString(k);
				if(Integer.parseInt(to) >= 10) {
					a = ((N.charAt(1) - '0')*10) + (to.charAt(0));

						if(a == Integer.parseInt(N)) {
							System.out.println(i);
							break;
							
						}
						i++;	
					N = Integer.toString(a);
					
				} else if (Integer.parseInt(to) < 10) {
					a = ((to.charAt(0)*10) - '0') + (to.charAt(0));
						
						if(a == Integer.parseInt(N)) {
							System.out.println(i);
							break;
						}
						i++;
					N = Integer.toString(a);

				}
			} else if (Integer.parseInt(N) < 10) {
				k = ((N.charAt(0)*10) - '0') + (N.charAt(0) - '0');
				String to = Integer.toString(k);
				if(Integer.parseInt(to) >= 10) {
					a = ((N.charAt(1) - '0')*10) + (to.charAt(1));
					i++;
						if(a == Integer.parseInt(N)) {
							System.out.println(i);
							break;
						}
					N = Integer.toString(a);
					
					
				} else if (Integer.parseInt(to) < 10) {
					a = ((to.charAt(0)*10) - '0') + (to.charAt(0));
					i++;
						if(a == Integer.parseInt(N)) {
							System.out.println(i);
							break;
						}
					N = Integer.toString(a);
				}
			}
			
		}

	}

}

