import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		long cnt5 = five(N) - five(N-M) - five(M);
		long cnt2 = two(N) - two(N-M) - two(M);
		
		System.out.println(Math.min(cnt5, cnt2));
	}
	
	static long five(long n) {
		long cnt = 0;
		
		while(n>=5) {
			cnt += n/5;
			n /= 5;
		}
		return cnt;
	}
	
	static long two(long n) {
		long cnt = 0;
		while(n>=2) {
			cnt += n/2;
			n /=2;
		}
		return cnt;
	}

}