import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
		
			if(a==0&&b==0&&c==0) {
				break;
			}
			
			int max = Integer.max(a, Integer.max(b, c));
			
			
			if(max==a) {
				if(b+c<=a) {
					System.out.println("Invalid");
					continue;
				}
			}else if(max==b) {
				if(a+c<=b) {
					System.out.println("Invalid");
					continue;
				}
			}else if(max==c) {
				if(b+a<=c) {
					System.out.println("Invalid");
					continue;
				}
			}
			
			if(a==b&&b==c&&c==a) {
				System.out.println("Equilateral");
				continue;
			}else if(a==b||b==c||c==a) {
				System.out.println("Isosceles");
				continue;
			}else {
				System.out.println("Scalene");
				continue;
			}
			
			
		}
	}

}