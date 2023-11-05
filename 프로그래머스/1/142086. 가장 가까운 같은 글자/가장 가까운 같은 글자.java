class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
        for(int i=s.length()-1; i>=0; i--){
            for(int j=i-1; j>=0; j--){
                if(arr[i]==arr[j]){
                    answer[i] = i-j;
                    break;
                }
            }
            if(answer[i]==0){
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}