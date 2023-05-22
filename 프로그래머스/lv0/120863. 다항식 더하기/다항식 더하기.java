class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] str = polynomial.split(" ");
        int x = 0;
        int n = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].contains("x")){
                x += str[i].equals("x") ? 1 : Integer.parseInt(str[i].replaceAll("x",""));
            }else if(!str[i].equals("+")){
                n += Integer.parseInt(str[i]);
            }
        }
        answer = (x != 0 ? x > 1? x +"x" : "x" : "") + (n != 0 ?(x != 0 ? " + " : "")+ n : x == 0 ? "0": "");
        
        
        return answer;
    }
}