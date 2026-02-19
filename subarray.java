public class subarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i]; // Add the current element to the current sum

            if(currentSum > maxSum) {
                maxSum = currentSum; // Update the maximum sum if the current sum is greater
            }

            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        subarray sa = new subarray();
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = sa.maxSubArray(nums);
        System.out.println("Maximum subarray sum is: " + result);
    }
}
