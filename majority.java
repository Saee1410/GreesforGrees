import java.util.HashSet;

public class majority {
    public static int isMajority(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) {
            if(!set.add(num)){
                return num;    
            }
        }
        return -1;
    }
 
    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        int result = isMajority(nums);
        System.out.println(result);
    }
    
}
