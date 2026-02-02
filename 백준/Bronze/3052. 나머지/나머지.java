import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int[] arr = new int[10];
		int[] check = new int[42];
		for(int i=0; i<check.length;i++) {
			check[i] = i;
		}
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		int[] answer = new int[42];
		StringBuilder sb = new StringBuilder();
		for(int c = 0; c<arr.length; c++) {
			for(int d = 0; d<check.length;d++) {
				if(arr[c]==check[d]) {
					answer[d]++;
				}
			}
			
		}
		
		for(int i=0; i<answer.length; i++) {
			if(answer[i]>0)cnt++;
		}
		System.out.println(cnt);
	}

}
