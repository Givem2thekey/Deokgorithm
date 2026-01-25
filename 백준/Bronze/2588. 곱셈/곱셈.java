import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		 for(int i=str.length()-1; i>=0; i--) {
			 sb.append(a*(str.charAt(i)-'0')).append("\n");
		 }
		 sb.append(a*Integer.parseInt(str));
		

		
		System.out.print(sb);
				


	}

}
