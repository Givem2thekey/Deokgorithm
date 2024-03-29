import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(q.size()>1) {
			for (int i = 1; i <= K; i++) {
				int a = q.poll();
				if(i!=K) {
					q.add(a);
				}
				else {
					sb.append(a).append(", ");
				}
			}
		}
		sb.append(q.poll()).append(">");
		
		System.out.println(sb);
	}

}