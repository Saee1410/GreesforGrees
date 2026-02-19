import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) return;

         int n = nums.length;
        int i = n - 2;
        
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if( i >= 0) {
            int j = n -1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
    }
    reverse(nums, i + 1, n - 1);

}
private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
    
public static void reverse(int[] nums, int start, int end) {
    while(start < end) {
        swap(nums, start, end--);
    }
 }
       
    public static void main(String[] args) {
      NextPermutation sol = new NextPermutation();

        // Example 1
        int[] nums1 = {1, 2, 3};
        sol.nextPermutation(nums1);
        System.out.println("Next Permutation of [1, 2, 3] -> " + Arrays.toString(nums1));

        // Example 2
        int[] nums2 = {3, 2, 1};
        sol.nextPermutation(nums2);
        System.out.println("Next Permutation of [3, 2, 1] -> " + Arrays.toString(nums2));

        // Example 3
        int[] nums3 = {1, 5, 8, 4, 7, 6, 5, 3, 1};
        sol.nextPermutation(nums3);
        System.out.println("Next Permutation of [1, 5, 8, 4, 7, 6, 5, 3, 1] -> " + Arrays.toString(nums3));
    }
}
