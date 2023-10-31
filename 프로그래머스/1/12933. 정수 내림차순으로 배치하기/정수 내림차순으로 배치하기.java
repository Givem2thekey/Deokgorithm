import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse += arr[i];
        }
        answer = Long.parseLong(reverse);
        return answer;
    }
}