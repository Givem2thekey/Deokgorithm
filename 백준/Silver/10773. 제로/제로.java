import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < K; i++) {
			int n = sc.nextInt();
			if (n == 0) {
				s.pop();
			} else {
				s.push(n);
			}
		}
		int sum = 0;
		for(int i: s) {
			sum+=i;
		}
		System.out.println(sum);
	}

}