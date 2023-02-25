import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] arr = new String[20][3];

		Map<String, Double> point = new HashMap<String, Double>() {
			{
				put("A+", 4.5);
				put("A0", 4.0);
				put("B+", 3.5);
				put("B0", 3.0);
				put("C+", 2.5);
				put("C0", 2.0);
				put("D+", 1.5);
				put("D0", 1.0);
				put("F", 0.0);
				put("P", 0.0);
			}
		};

		double sum = 0;
		double cnt = 0;

		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				arr[i][j] = st.nextToken();
			}
			
			if(!arr[i][2].equals("P")) {
				cnt+=Double.parseDouble(arr[i][1]);
				sum+=Double.parseDouble(arr[i][1])*point.get(arr[i][2]);
			}

		}
		
		System.out.println(sum/cnt);
	}

}