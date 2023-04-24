
import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer;
        char[] c = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = c.length-1; i>=0; i--){
            sb.append(c[i]);
        }
        answer = sb.toString();
        return answer;
    }
}