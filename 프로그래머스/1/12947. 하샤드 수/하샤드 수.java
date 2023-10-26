class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int copy = x;
        int sum = 0;
        while(copy>0){
            sum += copy%10;
            copy/=10;
        }
        
        if(x%sum==0){
            answer = true;
        }
        
        return answer;
    }
}