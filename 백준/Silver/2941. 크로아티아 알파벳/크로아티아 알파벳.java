import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};

		for(int i=0; i<arr.length;i++) {			
				str = str.replace(arr[i], "*");
		}
		
		
		System.out.println(str.length());
		
		
	}

}
