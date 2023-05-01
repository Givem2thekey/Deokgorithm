class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 5;
        int cap = 3;
        int work = 1;
        answer += hp/general;
        answer += (hp%general)/cap;
        answer += ((hp%general)%cap)/work;
        return answer;
    }
}