class Solution {
    public int solution(String s) {
        char c = s.charAt(0);
        int cntA = 0;
        int cntB = 0;
        int answer = 0;
        for(int i=0; i<s.length(); i++){
            if(cntA==cntB){
                answer++;
                c = s.charAt(i);
            }
            if(s.charAt(i) == c) cntA++;
            else cntB++;
        }
        return answer;
    }
}