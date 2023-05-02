class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        
        String[] arr = letter.split(" ");
        
        for(String word : arr){
            for(int i = 0; i < morse.length; i++){
                if(word.equals(morse[i])) answer+=Character.toString(i+'a');
            }
        }
        
        return answer;
    }
}