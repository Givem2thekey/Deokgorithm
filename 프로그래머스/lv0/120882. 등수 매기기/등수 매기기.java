import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int l = score.length;
        int[] answer = new int[l];
        List<Integer> average = new ArrayList<>();
        
        for(int i=0; i<l; i++){
            average.add(score[i][0] + score[i][1]);
        }
        average.sort(Comparator.reverseOrder());
        for(int i=0; i<l; i++){
            answer[i]  = average.indexOf(score[i][0] + score[i][1])+1;
        }

        return answer;
    }
}