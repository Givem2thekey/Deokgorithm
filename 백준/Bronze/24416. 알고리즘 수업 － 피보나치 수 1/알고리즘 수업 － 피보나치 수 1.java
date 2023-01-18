import java.util.Scanner;

public class Main {
	static int recCnt = 0;
	static int dpCnt = 0;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		arr = new int[N];
		
		fib(N);
		fibo(N);
		System.out.println(recCnt+" "+dpCnt);
		
	}
	
	static int fib(int n) {
		if(n == 1 || n == 2) {
			recCnt++;
			return 1;
		}else {
			return (fib(n-1) + fib(n-2));
		}
	}
	
	static int fibo(int n) {
		arr[1] = 1;
		arr[0] = 1;
		
		for (int i = 2; i < n; i++) {
			dpCnt++;
			arr[i] = arr[i-2] + arr[i-1];
		}
		return arr[n-1];
		
	}

}