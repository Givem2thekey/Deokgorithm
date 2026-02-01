import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=T; i>0; i--) {
			for(int j=1;j<=T-i+1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}