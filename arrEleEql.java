import java.util.Arrays;

public class arrEleEql {
    static int minCost(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        int right = 0;
        for(int i = 0; i < n; i++){
            right += arr[i];
        }
        int ans = Integer.MAX_VALUE;
        int left = 0;

        for(int i = 0; i < n; i++){
            right -= arr[i];
            int leftCost = i * arr[i] - left;
            int rightCost = right - (n - 1 -i) * arr[i];
            ans = Math.min(ans, leftCost + rightCost);
            left += arr[i];
        }
        return ans;
    } 
    public static void main(String[] args){
        int[] arr = {1, 100, 101};
        System.out.println(minCost(arr));
    } 
}
