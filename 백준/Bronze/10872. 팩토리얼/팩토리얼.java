import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(factorial(N));
		
	}
	
	public static int factorial(int x) {
		
		if(x <= 1) return 1;
		else return x*factorial(x-1);
		
	}
}