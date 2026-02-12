import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		n = ((int)Math.pow(2, n)) +1;
		sb.append((int)Math.pow(n,2));
		
		
		System.out.println(sb);
		
	}

}