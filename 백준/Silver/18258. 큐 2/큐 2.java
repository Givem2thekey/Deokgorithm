import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int[] arr = new int[2000000];
		int front = 0;
		int back = 0;
		int size = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			switch (input) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				arr[back] = num;
				back++;
				size++;
				break;
			case "pop":
				if (arr[front] > 0) {
					sb.append(arr[front]).append("\n");
					front++;
					size--;
				} else {
					sb.append(-1).append("\n");
				}
				break;
			case "front":
				if (size == 0) {
					sb.append(-1).append("\n");
				} else {
					sb.append(arr[front]).append("\n");
				}
				break;
			case "back":
				if (size == 0) {
					sb.append(-1).append("\n");
				} else {
					sb.append(arr[back-1]).append("\n");
				}
				break;
			case "size":
				sb.append(size).append("\n");
				break;
			case "empty":
				if (size == 0) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			}
		}
		System.out.println(sb);
	}

}