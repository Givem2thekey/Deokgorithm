import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] arr;
	static final int div = 10007;
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
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
		
		return arr[N][K] = (bino_coef(N-1,K-1) + bino_coef(N-1,K))%div;
	}

}