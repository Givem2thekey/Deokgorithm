class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int i=0; i<queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            for(int j=0; j<a; j++){
                answer+=my_string.charAt(j);
            }
            for(int j=b; j>=a; j--){
                answer+=my_string.charAt(j);
            }
            for(int j=b+1; j<my_string.length(); j++){
                answer+=my_string.charAt(j); 
            }
            my_string = answer;
            answer="";
        }
        return my_string;
    }
}