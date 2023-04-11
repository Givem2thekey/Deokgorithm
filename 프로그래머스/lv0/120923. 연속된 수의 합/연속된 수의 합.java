class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int n = total/num;
        if(num%2 == 1){
            for(int i = num/2-1; i>=0; i--){
                answer[i] = n-1;
                n--;
            }
            n = total/num;
            for(int i= num/2; i<num; i++){
                answer[i] = n;
                n++;
            }
        }else{
            for(int i = num/2-1; i>=0; i--){
                answer[i] = n;
                n--;
            }
            n = total/num;
            for(int i= num/2-1; i<num; i++){
                answer[i] = n;
                n++;
            }
        }
        
        return answer;
    }
}