import java.util.Scanner;

public class Main {

	static int[] gap;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		gap = new int[N-1];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if(i>0) {
				gap[i-1] = arr[i] - arr[i-1];
			}
		}
		
		for (int i = 0; i <= gap.length-2; i++) {
			gap[i+1] = gcd(gap[i],gap[i+1]);
		}
		
		int result = gap[gap.length-1];
		
		System.out.println((arr[N-1] - arr[0])/result - (N-1));
		
		
	}
	public static int gcd(int a, int b) {
		while(b>0){
			int temp =a;
			
			a = b;
			b = temp%b;
		}
		return a;
	}

}