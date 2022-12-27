import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		HashSet<String> hs = new HashSet<String>();
		
		String name;
		for (int i = 0; i < str.length(); i++) {
			name="";
			for (int j = i+1; j <= str.length(); j++) {
				if(!hs.contains(str.subSequence(i, j))) {
					hs.add(str.substring(i,j));
				}
			}
		}
		System.out.println(hs.size());
	}

}