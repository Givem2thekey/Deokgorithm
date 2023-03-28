import java.util.Scanner;

public class Main {
	static long c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		c = sc.nextLong();
		
		System.out.println(pow(a,b));
	}

	static long pow(long a, long exp) {
		if(exp == 1) {
			return a%c;
		}
		
		long temp = pow(a, exp/2);
		
		if(exp % 2 == 1) {
			return (temp * temp %c) * a % c;
		}
		
		return temp * temp %c ;
	}
}