class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int n = c-1;
        while(n<my_string.length()){
            answer+= my_string.charAt(n);
            n+=m;
        }
        
        return answer;
    }
}