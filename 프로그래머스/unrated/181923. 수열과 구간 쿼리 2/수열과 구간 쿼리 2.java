class Solution {
    private static final int INF = 1000001;

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int result = INF;
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(queries[i][2]>=arr[j]||arr[j]>= result)continue;
                
                result = arr[j];
                
            }
            answer[i] = result == INF ? -1 : result;
        }
        return answer;
    }
}