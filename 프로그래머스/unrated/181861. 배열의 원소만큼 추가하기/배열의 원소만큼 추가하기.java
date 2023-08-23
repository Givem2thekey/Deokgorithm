class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int[] answer = new int[sum];
        int a=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                answer[a] = arr[i];
                a++;
            }
        }
        
        
        return answer;
    }
}