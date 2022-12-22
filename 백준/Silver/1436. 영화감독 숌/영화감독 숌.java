import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int end = 666;
		int cnt = 1;
		
		while(cnt != N) {
			end++;
			if(String.valueOf(end).contains("666")) {
				cnt++;
			}
		}
		
		System.out.println(end);
	}	

}