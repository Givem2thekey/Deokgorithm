import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if(N%4==0) {
			N /= 4;
		}else {
			N /= 4;
			N+=1;
		}
		for(int i=0; i<N; i++) {
			sb.append("long ");
		}
		sb.append("int");
		
		System.out.println(sb);
		
	}

}
