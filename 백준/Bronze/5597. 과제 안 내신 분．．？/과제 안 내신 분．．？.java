import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int[] arr = new int[30];
		for(int i=0; i<28; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n-1] = n;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int c = 0; c<arr.length; c++) {
			if(arr[c]==0) {
				sb.append(c+1).append("\n");
			}
		}
		System.out.println(sb);
	}

}
