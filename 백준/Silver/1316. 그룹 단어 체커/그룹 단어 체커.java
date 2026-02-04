import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		String str;
		int cnt=0;
		for(int i=0;i<N; i++) {
			str = br.readLine();
			char[] arr = str.toCharArray();
			boolean[] check = new boolean[26];
			boolean isGroupWord = true;
			int prev = 0;
			for(int j=0; j<arr.length;j++) {
				if(!check[arr[j]-'a']) {
					check[arr[j]-'a'] = true;
					prev = arr[j];
				}else if(check[arr[j]-'a']&&prev!=arr[j]) {
					isGroupWord = false;
					break;
				}
				
			}
			if(isGroupWord) {
				cnt++;
			}
		}
		
		
		System.out.println(cnt);
		
	}

}
