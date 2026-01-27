import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int totalPrice = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int priceCheck = 0;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			priceCheck += (a*b);
		}
		if(priceCheck == totalPrice) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
