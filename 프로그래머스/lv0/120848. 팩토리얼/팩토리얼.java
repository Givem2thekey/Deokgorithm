class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i<=10; i++){
            if(n >= factorial(i)){
                answer = i;
            }else{
                break;
            }
        }
        
        return answer;
    }
    public int factorial(int n){
        if(n>1){
            return n * factorial(n-1);
        }
        return n;
    }
    
}