import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = emergency.clone();
        Arrays.sort(copy);
        for(int i = 0; i<copy.length; i++){
            for(int j = copy.length-1; j>=0; j--){
                if(emergency[i]==copy[j]){
                    answer[i] = copy.length-j;
                }
            }
        }
        
        
        return answer;
    }
}