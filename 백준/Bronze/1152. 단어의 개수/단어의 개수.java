import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int cnt = 0;
		if(str.charAt(0)==' ')cnt-=1;
	    if(str.charAt(str.length()-1)==' ')cnt-=1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				cnt++;
			}
		}
		System.out.println(cnt+1);
		
	}

}
