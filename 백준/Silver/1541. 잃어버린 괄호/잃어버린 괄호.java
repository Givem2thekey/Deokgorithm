import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split("-");
		
		int ans = Integer.MAX_VALUE;
		
		for (int i = 0; i < str.length; i++) {
			int temp = 0;
			
			String[] add = str[i].split("\\+");
			
			for (int j = 0; j < add.length; j++) {
				temp += Integer.parseInt(add[j]);
			}
			
			if(ans == Integer.MAX_VALUE) {
				ans = temp;
			}else {
				ans -= temp;
			}
			
			
		}
		System.out.println(ans);
		
	}

}