import java.util.Scanner;

public class Main {

	static int[][] arr;
	
	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		arr = new int[N+1][K+1];
		
		System.out.println(bino_coef(N, K));
	}
	
	static int bino_coef(int N, int K) {
		if(arr[N][K]>0) {
			return arr[N][K];
		}
		if(N==K || K == 0) {
			return arr[N][K] = 1;
			
		}
		
		return bino_coef(N-1,K-1) + bino_coef(N-1,K);
	}

}