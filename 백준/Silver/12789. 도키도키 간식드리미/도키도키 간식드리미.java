import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int index = 1;
		String result = "Nice";
		
		String[] arr = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			int curnum = Integer.parseInt(arr[i]);
			if(index != curnum) {
				if(!stack.isEmpty() && index == stack.peek()) {
					index++;
					i--;
					stack.pop();
				}else{
					stack.push(curnum);
				}
			}else {
				index++;
			}
		}
		
		while(!stack.isEmpty()) {
			int pop = stack.pop();
			if(pop==index) {
				index++;
			}else {
				result = "Sad";
				break;
			}
		}
		System.out.println(result);
	}

}