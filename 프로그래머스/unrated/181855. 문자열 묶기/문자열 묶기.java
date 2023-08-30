import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[100000];
        int answer = 0;

        
        for(int i=0; i<strArr.length; i++){
            arr[strArr[i].length()]++;
        }
        Arrays.sort(arr);
        answer = arr[99999];
        return answer;
    }
}