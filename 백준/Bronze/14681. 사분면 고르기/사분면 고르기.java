import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		
		if(a>0) {
			if(b.charAt(0)=='-') {
				System.out.println(4);
			}else {
				System.out.println(1);
			}
		}else {
			if(b.charAt(0)!='-') {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
		}

	}

}
