class Solution {
    public String solution(String code) {
        String answer = "";
        char[] arr = code.toCharArray();
        int mode = 0;
        for(int i=0; i<arr.length; i++){
            if(mode == 0){
                if(arr[i] == '1'){
                    mode = 1;
                    continue;
                }
                if(i%2==0){
                    answer+=arr[i];
                }
            }else{
                if(arr[i] == '1'){
                    mode = 0;
                    continue;
                }
                if(i%2==1){
                    answer+=arr[i];
                }
            }
        }
        if(answer.equals("")) answer="EMPTY";
        return answer;
    }
}