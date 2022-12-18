import java.util.Scanner;

public class Main {

	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		sb.append((int)(Math.pow(2, N)-1)).append('\n');
		
		hanoi(N,1,2,3);
		System.out.println(sb);
	}
	
	/*
	 * N : 원판의 갯수
	 * start : 출발지
	 * move : 옮기기 위한 이동 위치
	 * to : 목적지
	 */
	
	public static void hanoi(int N, int start, int move, int to) {
		if(N==1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		
		hanoi(N-1, start, to, move);
		
		sb.append(start+ " " + to + "\n");
		
		hanoi(N-1, move, start, to);
	}
}