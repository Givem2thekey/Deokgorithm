import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		int range = 1;
		if(n==1) {
			System.out.println(1);;
		}else {
			while(range < n) {
				range = range + (6 * cnt);
				cnt++;
			}
			System.out.println(cnt);
		}

				
	}

}
