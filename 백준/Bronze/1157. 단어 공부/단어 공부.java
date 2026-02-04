import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine().toUpperCase();
		
		char[] arr = str.toCharArray();
		int[] idxArr = new int[26];
		
		
		for(int i=0; i<arr.length; i++) {
			idxArr[arr[i]-'A']++;
		}
		int max = -1;
		char result='?';
		
		for(int i=0; i<idxArr.length;i++) {
			if(idxArr[i]>max) {
				max = idxArr[i];
				result = (char)(i+'A');
			}else if(idxArr[i]==max) {
				result = '?';
			}
		}
		System.out.println(result);
		
		
	}

}
