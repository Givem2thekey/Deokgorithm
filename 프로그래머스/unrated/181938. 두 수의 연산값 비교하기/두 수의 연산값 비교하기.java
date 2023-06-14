class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = 2*a*b;
        String str = ""+a+b;
        int d = Integer.parseInt(str);
        answer = c>d?c:d;
        return answer;
    }
}