class Solution {
    public int[] solution(int[] sequence, int k) {
        int start = 0;
        int end = sequence.length;
        int sum = 0;
        
        for(int s=0,e=0; s<sequence.length; s++){
            while(e<sequence.length && sum < k){
                sum+= sequence[e++];
            }
            
            if(sum == k){
                int range = e - s - 1;
                if((end - start) > range){
                    start = s;
                    end = e - 1;
                }
            }
            sum -= sequence[s];
        }
        
        int[] answer = {start, end};
        
        
        return answer;
    }
}