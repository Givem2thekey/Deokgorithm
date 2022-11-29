import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] arrM = new int[8001];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int input;
		for (int i = 0; i < N; i++) {
			input = Integer.parseInt(br.readLine());
			arr[i] = input;
			arrM[input + 4000]++;
			sum += input;
		}
		Arrays.sort(arr);
		int avg = (int)Math.round((double)sum/N);
		System.out.println(avg);
		int half = N / 2;
		System.out.println(arr[half]);
		ArrayList<Integer> al = new ArrayList<>();
		int maxIdx = 0;
		for (int i = 0; i < arrM.length; i++) {
			if (max < arrM[i]) {
				max = arrM[i];
				maxIdx = i - 4000;
			}
		}
		for (int i = 0; i < arrM.length; i++) {
			if (max == arrM[i])
				al.add(i - 4000);
		}
		if (al.size() > 1) {
			System.out.println(al.get(1));
		} else
			System.out.println(maxIdx);
		System.out.println(arr[N - 1] - arr[0]);

	}
}