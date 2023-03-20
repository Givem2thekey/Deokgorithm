import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int xmax = Integer.MIN_VALUE;
		int ymax = Integer.MIN_VALUE;
		int xmin = Integer.MAX_VALUE;
		int ymin = Integer.MAX_VALUE;
		
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {			
				arr[i][0] = sc.nextInt();
				if(arr[i][0]>xmax) {
					xmax = arr[i][0];
				}
				if(arr[i][0] < xmin) {
					xmin = arr[i][0];
				}
				arr[i][1] = sc.nextInt();
				if(arr[i][1]>ymax) {
					ymax = arr[i][1];
				}
				if(arr[i][1]<ymin) {
					ymin = arr[i][1];
				}
		}
		
		int result = (xmax-xmin) * (ymax - ymin);
		System.out.println(result);
		
		
	}

}