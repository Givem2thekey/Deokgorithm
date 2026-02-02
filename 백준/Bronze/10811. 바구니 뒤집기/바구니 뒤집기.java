import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		int[] arr = new int[N];
		
		for(int k=0; k<N; k++) {
			arr[k] = k+1;
		}
		
		for(int k=0; k<M; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			while(i<j) {
				int tmp = arr[i-1];
				arr[i-1] = arr[j-1];
				arr[j-1] = tmp;
				
				i++;
				j--;
				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length;i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);
		
	}

}
