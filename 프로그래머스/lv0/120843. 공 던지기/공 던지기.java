class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int t = 0;
        int index = 0;
        while(t<k){
            answer = numbers[index];
            index+=2;
            if(index>=numbers.length){
                index = index - numbers.length;
            }
            t++;
        }
        return answer;
    }
}