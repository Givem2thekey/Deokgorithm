import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i = Integer.parseInt(br.readLine());
		
		for(int j=1; j<=i; j++) {
			for(int k=i; k>=1; k--) {
				if(j<k) 
					bw.write(" ");
				else
					bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		
	}
}