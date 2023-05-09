import java.util.*;
class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i) - '9' <= 0){
                answer.add(my_string.charAt(i)-'0');
            }
        }
        Collections.sort(answer);
        return answer;
    }
}