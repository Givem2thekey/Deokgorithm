import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> resultList = new ArrayList<>();
        
        for (String str : answer) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }
        
        String[] resultArr = resultList.toArray(new String[resultList.size()]);
        Arrays.sort(resultArr);
     
        return resultArr;
    }
}