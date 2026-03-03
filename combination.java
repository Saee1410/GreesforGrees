import java.util.ArrayList;


public class combination {
    static void makeCombination(int[] arr, int remsum, ArrayList<Integer> cur, ArrayList<ArrayList<Integer>> res, int index){
        if (remsum == 0){
            res.add(new ArrayList<>(cur));
            return;
        }

        if(remsum < 0 || index >= arr.length)
            return;

        cur.add(arr[index]);
        makeCombination(arr, remsum - arr[index], cur, res, index);

        cur.remove(cur.size() -1);
        makeCombination(arr, remsum, cur, res, index + 1);
    }
    static ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target){
        ArrayList<Integer> cur = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        makeCombination(arr, target, cur, res, 0);
        return res;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int target = 5;
        ArrayList<ArrayList<Integer>> res = targetSumComb(arr, target);

        for (ArrayList<Integer> v : res){
            for (int i : v){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
