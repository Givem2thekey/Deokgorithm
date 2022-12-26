import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		HashSet<Integer> ah = new HashSet<Integer>();
		HashSet<Integer> bh = new HashSet<Integer>();
		
		for (int i = 0; i < a; i++) {
			ah.add(sc.nextInt());
		}
		for (int i = 0; i < b; i++) {
			bh.add(sc.nextInt());
		}
		int cnt = 0;
		for(int num : ah) {
			if(!bh.contains(num)) cnt++;
		}
		
		for(int num : bh) {
			if(!ah.contains(num)) cnt++;
		}
		
		System.out.println(cnt);

	}

}