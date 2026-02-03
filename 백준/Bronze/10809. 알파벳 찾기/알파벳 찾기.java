import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb= new StringBuilder();
		
		char[] charArr = str.toCharArray();
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}

		int a;
		for(int i=0; i<charArr.length; i++) {
			a = charArr[i]-'a';
			
			if(arr[a]==-1) {
				arr[a] = i;
				
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append(" ");

		}
		System.out.println(sb);
		
		
	}

}
