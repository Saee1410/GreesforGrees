import java.util.*;


public class combinationSum {
    public static void main(String[] args){
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // Include the current element
        if (arr[index] <= target) {
            ds.add(arr[index]);
            findCombinations(index, arr, target - arr[index], ans, ds);
            ds.remove(ds.size() - 1); // Backtrack
        }

        // Exclude the current element
        findCombinations(index + 1, arr, target, ans, ds);
    }
}