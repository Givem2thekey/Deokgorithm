class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        int j=0;
        for(int i=str.length()-1; i>=0; i--){
            answer[j] = str.charAt(i)-'0';
            j++;
        }
        return answer;
    }
}