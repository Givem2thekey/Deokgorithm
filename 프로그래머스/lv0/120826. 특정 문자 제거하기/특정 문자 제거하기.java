import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<my_string.length(); i++){
            if(letter.charAt(0)!=my_string.charAt(i)){
                sb.append(my_string.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}