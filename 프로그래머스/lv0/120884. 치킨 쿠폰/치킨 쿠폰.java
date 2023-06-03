class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while(chicken>=10){
            int newcoupon = chicken/10;
            int remain =chicken%10;
            chicken = newcoupon + remain;
            answer += newcoupon;
        }
        return answer;
    }
}