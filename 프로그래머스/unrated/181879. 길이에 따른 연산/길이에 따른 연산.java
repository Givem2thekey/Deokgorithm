class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        if(num_list.length<=10){
            for(int i=0; i<num_list.length; i++){
                answer*=num_list[i];
            }
        }else{
            for(int i=0; i<num_list.length; i++){
                answer+=num_list[i];
            }
            answer-=1;
        }
        return answer;
    }
}