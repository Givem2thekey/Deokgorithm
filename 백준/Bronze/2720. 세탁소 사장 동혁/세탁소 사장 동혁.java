import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Q = 25;
		int D = 10;
		int N = 5;
		int P = 1;
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			int c = Integer.parseInt(br.readLine());
			
			sb.append(c/Q).append(" ");
			c%=Q;
			sb.append(c/D).append(" ");
			c%=D;
			sb.append(c/N).append(" ");
			c%=N;
			sb.append(c).append("\n");
			
		}
		
		
		
		System.out.println(sb);
		
	}

}
