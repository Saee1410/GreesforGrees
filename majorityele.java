import java.util.HashMap;
import java.util.Map;

public class majorityele {
    static int majorityelement(int[] arr){
          int n = arr.length;
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int num: arr){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if(countMap.get(num) > n/2){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,3,5,1};
         System.out.println(majorityelement(arr));
    }
}
