import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int l = s.length();
		int[][] arr = new int[l+1][26];
		
		int q = Integer.parseInt(br.readLine());
		
		arr[1][s.charAt(0) - 'a']++;
		
		for (int i = 2; i <= l; i++) {
			int idx = s.charAt(i-1)-'a';
			
			for (int j = 0; j < 26; j++) {
				int bf = arr[i-1][j];
				arr[i][j] = j == idx?bf+1:bf;
			}
		}
		
		StringTokenizer st;
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int idx = st.nextToken().charAt(0)-'a';
			int start = Integer.parseInt(st.nextToken())+1;
			int end = Integer.parseInt(st.nextToken())+1;
			

			System.out.println(arr[end][idx] - arr[start-1][idx]);
			
			
		}
	}

}