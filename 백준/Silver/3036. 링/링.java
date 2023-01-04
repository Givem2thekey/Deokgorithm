import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int firstRing = sc.nextInt();
		
		for (int i = 1; i < N; i++) {
			int ring = sc.nextInt();
			int gcd = gcd(firstRing, ring);
			
			System.out.println((firstRing/gcd) + "/" + (ring/gcd));
		}
	}	

	static int gcd(int a, int b) {
		int r;
		
		while(b!=0) {
			r = a%b;
			a = b;
			b = r;
		}
		
		return a;
		
	}
}