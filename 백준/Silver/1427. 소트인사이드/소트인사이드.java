import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] arr = input.split("");
		
		Integer[] arr2 = new Integer[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(arr2,Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr2.length; i++) {
			sb.append(arr2[i]);
		}
		System.out.println(sb);
		
		
		
	}

}