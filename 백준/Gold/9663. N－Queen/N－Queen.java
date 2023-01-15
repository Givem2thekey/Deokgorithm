import java.util.Scanner;

public class Main {
		
		static int[] arr;
		static int N;
		static int cnt = 0;
		
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N];
		
		nQueen(0);
		System.out.println(cnt);
	}
		
	static void nQueen(int depth) {
		if(depth==N) {
			cnt++;
			return;
		}
		
		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			if(Possible(depth)) {
				nQueen(depth+1);
			}
		}
	}
	
	static boolean Possible(int col) {
		for (int i = 0; i < col; i++) {
			if(arr[col] == arr[i]) {
				return false;
			}
			else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;
	}

}