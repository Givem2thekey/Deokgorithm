class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String rev = "";
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='A'){
                rev+="B";
            }else if(myString.charAt(i)=='B'){
                rev+="A";
            }
        }
        if(rev.contains(pat)){
            answer=1;
        }
        return answer;
    }
}