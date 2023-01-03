import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int max = 0;
			for (int j = 1; j <=a&&j<=b; j++) {
				if(a%j==0&&b%j==0) {
					max = j;
				}
			}
			int lcm = a*b/max;
			System.out.println(lcm);
			
		}
	}
	

}