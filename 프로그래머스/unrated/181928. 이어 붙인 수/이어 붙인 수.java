class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String z = "";
        String h = "";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==1){
                h+= num_list[i]+"";
            }else{
                z+= num_list[i]+"";
            }
        }
        answer = Integer.parseInt(z)+Integer.parseInt(h);
        return answer;
    }
}