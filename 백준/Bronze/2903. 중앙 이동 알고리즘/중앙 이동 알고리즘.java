import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int t = 2;
		int result = 0;
		for (int i = 0; i < n; i++) {
			result = (int) Math.pow((2*t-1), 2);
			t = 2*t-1;
		}
		
		System.out.println(result);
	}

}