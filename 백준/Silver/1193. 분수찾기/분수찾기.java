import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int line = 1;
		int cnt = 0;
		
		while(true) {
			if(n<=cnt+line) {
				break;
			}
			cnt+=line;
			line++;
		}
		
		int numerator=0;
		int denominator=0;
		
		if(line%2==1) {
			numerator = line - (n-cnt-1);
			denominator = n-cnt;
		}else {
			numerator = n-cnt;
			denominator = line - (n-cnt-1);
		}
		
		System.out.println(numerator+"/"+denominator);

				
	}

}
