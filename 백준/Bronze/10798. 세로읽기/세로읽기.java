import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		char[][] arr = new char[5][15];
		int maxLength = 0;
		
		for(int i=0; i<5; i++) {
			String str =br.readLine();
			if(str == null)break;
			 maxLength = Math.max(maxLength,str.length());
			for(int j=0; j<str.length(); j++) {
				arr[i][j]= str.charAt(j);
				
			}
		}
		
		for(int j=0; j<maxLength; j++) {
			for(int i=0; i<5; i++	) {
				if(arr[i][j] != '\0') {
					sb.append(arr[i][j]);
				}
			}
		}
		
		
		System.out.println(sb);
	}

}
