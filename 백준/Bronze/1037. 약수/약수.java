import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int half = N/2;
		
		if(N%2==0) {
			System.out.println(arr[half-1]*arr[half]);
		}
		else {
			System.out.println((arr[half])*(arr[half]));
		}
	}

}