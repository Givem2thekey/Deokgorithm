import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		ArrayDeque<Integer> deque;
		
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			String str = sc.next();
			int n = sc.nextInt();
			
			st = new StringTokenizer(sc.next(),"[],");
			
			deque = new ArrayDeque<Integer>();
			
			for (int j = 0; j < n; j++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
			
			AC(str, deque);
				
		}
		System.out.println(sb);
	}
	
	static void AC(String str, ArrayDeque<Integer> deque) {
		boolean isRight = true;
		
		for(char command : str.toCharArray()) {
			if(command == 'R') {
				isRight = !isRight;
				continue;
			}
			
			if(isRight) {
				if(deque.pollFirst() == null) {
					sb.append("error\n");
					return;
				}
			}
			
			else {
				if(deque.pollLast() == null) {
					sb.append("error\n");
					return;
				}
			}
		}
		
		makePrintString(deque, isRight);
	}
	
	public static void makePrintString(ArrayDeque<Integer> deque, boolean isRight) {
		sb.append('[');
		
		if(deque.size()>0) {
			if(isRight) {
				sb.append(deque.pollFirst());
				
				while(!deque.isEmpty()) {
					sb.append(',').append(deque.pollFirst());
				}
			}
			else {
				sb.append(deque.pollLast());
				
				while(!deque.isEmpty()) {
					sb.append(',').append(deque.pollLast());
				}
			}
		}
		
		sb.append(']').append('\n');
	}

}