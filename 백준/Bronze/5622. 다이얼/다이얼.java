import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='1') {
				a+=2;
			}else if(str.charAt(i)-'A'<3) {
				a+=3;
			}else if(str.charAt(i)-'A'<6) {
				a+=4;
			}else if(str.charAt(i)-'A'<9) {
				a+=5;
			}else if(str.charAt(i)-'A'<12) {
				a+=6;
			}else if(str.charAt(i)-'A'<15) {
				a+=7;
			}else if(str.charAt(i)-'A'<19) {
				a+=8;
			}else if(str.charAt(i)-'A'<22) {
				a+=9;
			}else if(str.charAt(i)-'A'<26) {
				a+=10;
			}else {
				a+=11;
			}
		}

		System.out.println(a);
	}

}
