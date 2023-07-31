import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int a=0,b=0;;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                a=i;
                b=i;
                break;
            }
        }
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == 2){
                b=i;
                break;
            }
        }
        if(a==0&&b==0){
            list.add(-1);
        }else{
            for(int i=a; i<=b; i++){
                list.add(arr[i]);    
            }
        }
        return list;
    }
}