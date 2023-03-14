import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		boolean[] num = new boolean[1000001];
		num[0] = num[1] = true;
		
		for(int i = 2; i*i <= 1000000; i++) {
			if(!num[i]) {
				for (int j = i+i; j <= 1000000; j+=i) {
					num[j] = true;
				}
			}
		}
		
		while(t--> 0) {
			int temp = sc.nextInt();
			int result = 0;
			for (int i = 2; i <= temp/2; i++) {
				if(!num[i] && !num[temp-i]) {
					result++;
				}
			}
			System.out.println(result);
		}
	}

}