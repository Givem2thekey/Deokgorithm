class Solution {
    public String solution(String s) {
        String answer = "";
        int l = s.length();
        if(l%2==0){
            answer+= s.charAt(l/2-1);
            answer += s.charAt(l/2);
        }else{
            answer += s.charAt(s.length()/2);
        }
        
        return answer;
    }
}