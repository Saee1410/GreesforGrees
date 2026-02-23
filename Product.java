public class Product {
    public int maxProduct(int[] nums){
        if (nums.length == 0) return 0;

        // Initialize variables with the first element
        int res = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];

            // Jar n negative asel, tar max ani min swap hotat
            // Karun negative * negative = positive (motha number) hovu shakto
            if (n < 0) {
                int temp = curMax;
                curMax = curMin;
                curMin = temp;
            }

            // Current element pasun suru honara navin max/min calculate kara
            curMax = Math.max(n, curMax * n);
            curMin = Math.min(n, curMin * n);

            // Global result update kara
            res = Math.max(res, curMax);
        }

        return res;
    }
    public static void main(String[] args) {
        Product product = new Product();
        int[] nums = {2, 3, -2, 4};
        int result = product.maxProduct(nums);
        System.out.println("Maximum product subarray is: " + result); // Output: 6
    }
}
