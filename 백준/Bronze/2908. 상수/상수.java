import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		char[] arrA = a.toCharArray();
		char[] arrB = b.toCharArray();
		int c,d;
		c = (a.charAt(2)-'0')*100 + (a.charAt(1)-'0')*10 + (a.charAt(0)-'0');
		d = (b.charAt(2)-'0')*100 + (b.charAt(1)-'0')*10 + (b.charAt(0)-'0');
		
		System.out.println(Math.max(c, d));

		
	}

}
