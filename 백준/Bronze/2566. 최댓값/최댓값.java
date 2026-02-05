import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
		int[][] arr = new int[9][9];
		int max = Integer.MIN_VALUE;
		int x = 0;
		int y = 0;
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(max<arr[i][j]) {
					max = arr[i][j];
					x = i;	
					y = j;
				}
			}
		}
		sb.append(max).append("\n");
		sb.append(x+1).append(" ").append(y+1);
		System.out.println(sb);
	

		
	}

}
