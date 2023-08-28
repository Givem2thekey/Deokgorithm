class Solution {
    public int[] solution(int[] arr) {
        int a = arr.length;
        while(a>0){
            a/=2;
        }
        if(a==1){
            return arr;
        }
        double x = 0; 
        int y = 0;
        int b = arr.length;
        while(b>x){
            x = Math.pow(2,y++);
        }
        int[] answer = new int[(int)x];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        
        return answer;
    }
}