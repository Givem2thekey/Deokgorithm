class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int[] check = new int[10];
        
        
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];
        }
        return 45-answer-1;
    }
}