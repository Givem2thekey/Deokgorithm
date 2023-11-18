class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                char c = (char)(s.charAt(i) + n);
                if(c>'z'){
                    c-=26;
                }
            
                answer+=c;
            }if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                char c = (char)(s.charAt(i) + n);
                if(c>'Z'){
                    c-=26;
                }
            
                answer+=c;
            }else if(s.charAt(i)==' '){
                answer+=s.charAt(i);
            }
        }
        return answer;
    }
}