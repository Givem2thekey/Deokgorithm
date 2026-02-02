import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int i,j,k;
		int[] arr = new int[N];
		for(int a=0; a<M; a++) {
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			for(int b=i-1; b<=j-1;b++) {
				arr[b] = k;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int c = 0; c<arr.length; c++) {
			sb.append(arr[c]).append(" ");
		}
		System.out.println(sb);
	}

}
