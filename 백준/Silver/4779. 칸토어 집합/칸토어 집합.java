import java.util.Scanner;

public class Main {
	static int n;
	static char[] c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb =  new StringBuilder();
		while(sc.hasNext()) {
			n = sc.nextInt();
			int length = (int)Math.pow(3, n);
			c = new char[length];
			
			for (int i = 0; i < length; i++) {
				c[i] = '-';
			}
			
			cantoer(0,length);
			
			for (int i = 0; i < length; i++) {
				sb.append(c[i]);
			}
			System.out.println(sb);
			sb.delete(0, sb.length());
		}
	}
	
	static void cantoer(int start, int length) {
		if(length<3	) {
			return;
		}
		int l = length/3;
		for (int i = start+l; i < start+l*2; i++) {
			c[i] = ' ';
		}
		
		cantoer(start, l);
		
		cantoer(start+l*2, length/3);
	}

}