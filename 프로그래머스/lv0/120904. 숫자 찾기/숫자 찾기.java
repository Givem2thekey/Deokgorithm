class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        char sk = (char)k;
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k+'0'){
                answer = i+1;
                break;
            }
        }
        if(answer == 0){
            answer = -1;
        }
        return answer;
    }
}