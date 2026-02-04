import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		double sum = 0;
		double gscore = 0;
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			if(!grade.equals("P")) {			
				sum+=score;;
				gscore += caculScore(grade, score);

			}
		}
		System.out.println(gscore/sum);

		
	}

	public static double caculScore(String grade,double score) {
		double gscore=0.0;
		switch(grade) {
		case"A+":
			gscore = 4.5*score;
			break;
		case"A0":
			gscore = 4.0*score;
			break;
		case"B+":
			gscore = 3.5*score;
			break;
		case"B0":
			gscore = 3.0*score;
			break;
		case"C+":
			gscore = 2.5*score;
			break;
		case"C0":
			gscore = 2.0*score;
			break;
		case"D+":
			gscore = 1.5*score;
			break;
		case"D0":
			gscore = 1.0*score;
			break;
		case"F":
			gscore = 0.0*score;
			break;
		}
		return gscore;
	}
}
