import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int change = sc.nextInt();

			int quarter = 0;
			int dime = 0;
			int nickel = 0;
			int penny = 0;
			
			quarter = change/25;
			change%=25;
			dime = change/10;
			change%=10;
			nickel = change/5;
			change%=5;
			penny = change;
			
			System.out.println(quarter +" "+ dime + " " + nickel + " " + penny);
		}
	}

}