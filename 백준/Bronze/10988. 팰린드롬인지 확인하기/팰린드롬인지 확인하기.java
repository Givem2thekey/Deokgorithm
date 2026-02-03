import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		char[] arr = str.toCharArray();
		int i=0;
		int answer = 1;
		while(i<=str.length()/2) {
			if(arr[i]!=arr[arr.length-i-1]) {
				answer = 0;
				break;
			}
			i++;
		}
		
		System.out.println(answer);
		
		
	}

}