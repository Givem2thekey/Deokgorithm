import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		if(a==b&&b==c) {
			result = 10000 + a*1000;
		}else if(a==b||a==c){
			result = 1000 + 100 * a;
		}else if(b==c) {
			result = 1000 + 100 * b;
		}else {
			result = 100 * Math.max(a, Math.max(b, c));
		}
		
		System.out.println(result);

	}

}
