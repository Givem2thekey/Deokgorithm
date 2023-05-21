class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(int i=0; i<keyinput.length; i++){
            
                if(keyinput[i].equals("left")){
                    if(board[0]/2 <= -(answer[0])){
                        continue;
                    }else{
                        answer[0]--;
                    }
                }else if(keyinput[i].equals("right")){
                    if(board[0]/2 <= answer[0]){
                        continue;
                    }else{
                        answer[0]++;
                    }
                }
            
           
                if(keyinput[i].equals("up")){
                    if(board[1]/2 <= answer[1]){
                        continue;
                    }else{
                        answer[1]++;
                    }
                }else if(keyinput[i].equals("down")){
                    if(board[1]/2 <= -(answer[1])){
                        continue;
                    }else{
                        answer[1]--;
                    }
                }   
        }
        
        return answer;
    }
}