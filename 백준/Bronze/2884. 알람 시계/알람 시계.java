import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(b-45<0) {
			if(a>=1) {
				a-=1;
				b+=15;
			}
			else{
				b+=15;
				a=23;
			}
		}else {
			b-=45;
		}
		
		System.out.println(a + " " + b);

	}

}
