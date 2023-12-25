import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int l = end-start+1;
            int[] arr = new int[l];
            int zero = 0;
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                arr[zero] = array[j];
                zero++;
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}