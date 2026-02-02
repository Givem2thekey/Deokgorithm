import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int tmp = 0;
			
			tmp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = tmp;
			
		}
		StringBuilder sb = new StringBuilder();
		for(int c = 0; c<arr.length; c++) {
			sb.append(arr[c]).append(" ");
		}
		System.out.println(sb);
	}

}