import java.util.Scanner;

public class Main {
	static long[] arr = new long[101];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<101;i++){
            arr[i] = -1;
        }
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			
			System.out.println(wave(n));
		}
	}
	
	static long wave(int n) {
		if(arr[n]==-1) {
			arr[n] = wave(n-2)+wave(n-3);
		}
		return arr[n];
	}
}