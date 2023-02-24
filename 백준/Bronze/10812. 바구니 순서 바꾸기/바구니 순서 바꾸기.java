import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();
			
			rotate(a,b,k);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb);
	}
	
	static void rotate(int a, int b, int c) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = c-1; i <= b-1; i++) {
			q.add(arr[i]);
		}
		for (int i = a-1; i < c-1; i++) {
			q.add(arr[i]);
		}
		
		for (int i = a-1; i <= b-1; i++) {
			arr[i] = q.poll();
		}
		
	}

}