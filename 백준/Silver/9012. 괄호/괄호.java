import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			sb.append(isVPS(br.readLine())).append("\n");
		}
		
		System.out.println(sb);

	}

	public static String isVPS(String str) {
		Stack<Character> s = new Stack<>();

		for (int j = 0; j < str.length(); j++) {
			
			char idx = str.charAt(j);
			
			if (idx == '(') {
				s.push(idx);
			} else if (s.empty()) {
				return "NO";

			} else {
				s.pop();
			}
		}

		if (s.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

}