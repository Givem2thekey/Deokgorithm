class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        
        long R1 = (long)Math.pow(r1,2);
        long R2 = (long)Math.pow(r2,2);
        long side = 0;
        
        for(int i=0; i<=r2; i++){
            long y2 = (long)Math.sqrt(R2-(long)Math.pow(i,2));
            long y1 = (long)Math.sqrt(R1-(long)Math.pow(i,2));
            
            if(Math.sqrt((R1-Math.pow(i,2)))%1==0){
                side++;
            }
            
            answer += 4*(y2-y1);
        }
        
        answer += 4*(side - 1);
    
        
        return answer;
    }
   
}