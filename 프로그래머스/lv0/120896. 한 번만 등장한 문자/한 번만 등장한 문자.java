class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] cnt = new int[26];
        for(int i=0; i<s.length(); i++){
            cnt[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<cnt.length; i++){
            if(cnt[i]==1){
                answer+=arr[i];
            }
        }

        return answer;
    }
}