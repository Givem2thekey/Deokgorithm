import java.util.*;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++) {
	        while(n % i == 0) {
                if(!answer.contains(i)){
		            answer.add(i);
                }
                 n /= i;
	        }
        }
        return answer;
    }
}