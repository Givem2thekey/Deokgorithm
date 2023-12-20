class Solution {
    public int solution(int[] nums) {
        int answer = 0;
    
        for(int i=0; i<nums.length-2; i++){
            int sum=0;
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    boolean check = true;
                    for(int z=2; z<=Math.sqrt(sum);z++){
                        if(sum%z==0){
                            check=false;
                            break;
                        }
                    }
                    if(check) answer++;
                }
            }
        }

        return answer;
    }
}