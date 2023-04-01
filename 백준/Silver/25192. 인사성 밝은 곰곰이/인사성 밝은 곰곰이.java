import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cnt = 0;
		
		HashSet<String> hs = new HashSet<>();	
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			
			if(str.equals("ENTER")) {
				hs = new HashSet<>();
				continue;
			}
			
			if(!hs.contains(str)) {
				hs.add(str);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}