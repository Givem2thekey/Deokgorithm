import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		boolean[][] arr = new boolean[100][100];
		for(int i=0; i<n; i++) {
			st = new  StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int row=x; row<x+10; row++) {
				for(int col=y; col<y+10; col++) {
					arr[row][col]=true;
				}
			}
		}
		int result = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(arr[i][j]) result++;
			}
		}
		System.out.println(result);
	}

}
