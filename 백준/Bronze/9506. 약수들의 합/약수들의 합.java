import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		while(true) {
			String line = br.readLine();
			if(line == null || line.equals("-1"))break;
			
			int n = Integer.parseInt(line);
			
			ArrayList<Integer> al = new ArrayList<>();
			int sum = 0;
			
			for(int i=1; i<=n/2; i++) {
				if(n%i==0) {
					al.add(i);
					sum +=i;
				}
			}
			
			if(sum == n) {
				sb.append(n).append(" = ");
				for(int i=0; i<al.size(); i++) {
					sb.append(al.get(i));
					if(i<al.size()-1)sb.append(" + ");
				}
				sb.append("\n");
			}else {
				sb.append(n).append(" is NOT perfect.\n");
			}
		}
	
		System.out.print(sb);
	}

}