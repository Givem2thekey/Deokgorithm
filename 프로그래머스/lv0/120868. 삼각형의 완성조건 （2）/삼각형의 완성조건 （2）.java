import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int a = sides[0];
        int b = sides[1];
        int sum = a + b;
        for(int i=b+1; i<sum; i++){
            answer++;
        }
        for(int i=b-a+1; i<=b; i++){
            answer++;
        }
        
        return answer;
    }
}