import java.util.Scanner;

public class Main {
	static int[][] arr;
	static int[] w;
	static int[] v;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		w = new int[n];
		v = new int[n];
		
		arr = new int[n][k+1];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		System.out.println(backpack(n-1,k));
	}
	static int backpack(int i,int k) {
		if(i<0) return 0;
		
		if(arr[i][k] == 0) {
			if(w[i]>k) {
				arr[i][k] = backpack(i-1,k);
			}else {
				arr[i][k] = Math.max(backpack(i-1, k), backpack(i-1, k-w[i])+v[i]);
			}
		}
		return arr[i][k];
	}
}