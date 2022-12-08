import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		int s[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			s[i] = arr[i];
		}
		
		Arrays.sort(s);
		
		HashMap<Integer, Integer> m = new HashMap();
		
		int rank = 0 ;
		
		for (int i = 0; i < s.length; i++) {
			if(!m.containsKey(s[i])) {
				m.put(s[i],rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length; i++) {
			sb.append(m.get(arr[i])).append(" ");
		}
		
		System.out.println(sb);
	}

}