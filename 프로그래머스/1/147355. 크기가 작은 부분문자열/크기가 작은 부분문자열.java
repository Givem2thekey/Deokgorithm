class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        Long n = Long.parseLong(p);
        for(int i=0; i<t.length()-len+1;i++){
            long diff = Long.parseLong(t.substring(i, i+len));
            if(diff<=n) answer++;
        }
        return answer;
    }
}