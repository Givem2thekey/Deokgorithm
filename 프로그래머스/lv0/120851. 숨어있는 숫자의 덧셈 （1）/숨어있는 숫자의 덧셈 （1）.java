class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]","");
        char[] arr = my_string.toCharArray();
        for(int i = 0; i<arr.length; i++){
            answer+= arr[i] - '0';
        }
        return answer;
    }
}