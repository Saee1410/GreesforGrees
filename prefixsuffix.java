import java.util.Arrays;

public class prefixsuffix {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // Arrays define karne
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];

        // 1. Prefix Calculation: Davya bajucha product
        prefix[0] = 1;
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // 2. Suffix Calculation: Ujvya bajucha product
        suffix[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // 3. Final Answer: Prefix * Suffix
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans; // Fakt array cha naav return karayche
    }

    public static void main(String[] args) {
        prefixsuffix sol = new prefixsuffix();
        int[] nums = {1, 2, 3, 4};
        
        // Method call karun result ghene
        int[] result = sol.productExceptSelf(nums);
        
        // Arrays.toString vaprun array print karne
        System.out.println("Product of array except self: " + Arrays.toString(result)); 
        // Expected Output: [24, 12, 8, 6]
    }
}