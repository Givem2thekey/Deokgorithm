import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		int A,B;
		StringBuilder sb=new StringBuilder();
		String str;
		while((str = br.readLine())!=null) {
			st = new StringTokenizer(str);
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			sb.append(A+B).append("\n");
		}
		System.out.print(sb);
	}

}
