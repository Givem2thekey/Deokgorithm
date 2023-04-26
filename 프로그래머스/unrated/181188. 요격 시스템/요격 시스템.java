import java.util.Arrays;
class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        Arrays.sort(targets, (o1,o2) -> o1[1] - o2[1]);
        
        int shoot = 0;
        
        for(int i = 0; i< targets.length; i++){
            int left = targets[i][0];
            int right = targets[i][1];
            if(left>=shoot){
                answer++;
                shoot = right;
            }
        }
        
        
        return answer;
    }
}