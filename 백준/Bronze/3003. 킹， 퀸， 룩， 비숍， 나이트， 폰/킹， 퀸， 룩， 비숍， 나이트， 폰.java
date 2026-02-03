import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		sb.append(1-Integer.parseInt(st.nextToken())).append(" ");
		sb.append(1-Integer.parseInt(st.nextToken())).append(" ");
		sb.append(2-Integer.parseInt(st.nextToken())).append(" ");
		sb.append(2-Integer.parseInt(st.nextToken())).append(" ");
		sb.append(2-Integer.parseInt(st.nextToken())).append(" ");
		sb.append(8-Integer.parseInt(st.nextToken())).append(" ");
		System.out.println(sb);
		
	}

}
