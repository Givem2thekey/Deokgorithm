import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] bc = before.toCharArray();
        char[] ac = after.toCharArray();
        
        Arrays.sort(bc);
        Arrays.sort(ac);
        
        String bs = new String(bc);
        String as = new String(ac);
        
        if(bs.equals(as)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}