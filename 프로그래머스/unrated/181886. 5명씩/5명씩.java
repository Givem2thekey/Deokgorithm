class Solution {
    public String[] solution(String[] names) {
        int size = (int)Math.ceil(names.length/5.0);
        String[] answer = new String[size];
        int n = 0;
        for(int i=0; i<answer.length; i++){
            answer[i] = names[i+n];
            n+=4;
        }
        return answer;
    }
}