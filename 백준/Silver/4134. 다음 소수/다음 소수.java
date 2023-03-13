import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int tc = sc.nextInt();
		

		for (int i = 0; i < tc; i++) {
			long n = sc.nextLong();
			BigInteger bi = new BigInteger(String.valueOf(n));
			
			if(bi.isProbablePrime(10)) {
				sb.append(n).append("\n");
			}else {
				sb.append(bi.nextProbablePrime()).append("\n");
			}
		}
		
		System.out.println(sb);
	}

}