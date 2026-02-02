import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<T; i++) {
			for(int j=T-i-1;j>0; j--) {
				sb.append(" ");
			}
			for(int k=T; k<=T+i;k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
