class Solution {
    public String solution(String n_str) {
        String answer = "";
        Boolean zero = false;
       for (char c : n_str.toCharArray()) {
            if (c == '0' && !zero) {
                continue;
            }
            zero = true;
            answer += c;
        }
        return answer;
    }
}