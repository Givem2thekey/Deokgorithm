class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.toLowerCase();
        String p = pat.toLowerCase();
        if(str.contains(p)) {
            answer=1;
        }
        return answer;
    }
}