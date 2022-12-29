import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		double u = R*R*Math.PI;
		double t = 2*R*R;
		System.out.printf("%6f\n",u);
		System.out.printf("%6f",t);
	}

}