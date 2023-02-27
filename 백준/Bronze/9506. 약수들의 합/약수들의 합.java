import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = sc.nextInt();
			if(n == -1) break;
			LinkedList<Integer> list = new LinkedList<>();
			
			int sum = 0;
			
			for (int i = 1; i < n; i++) {
				if(n%i == 0) {
					list.add(i);
					sum+=i;

				}
				
			}

			if(sum == n) {
				sb.append(n).append(" = ");
				for (int i = 0; i < list.size()-1; i++) {
					sb.append(list.get(i)).append(" + ");
				}
				sb.append(list.getLast()).append("\n");
			}else {
				sb.append(n).append(" is NOT perfect.").append("\n");
			}
	
		}
		
		System.out.println(sb);
	}

}