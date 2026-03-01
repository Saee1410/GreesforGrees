import java.util.HashSet;

public class pairDiff {
    static boolean findPair(int[] arr, int x){
        HashSet<Integer> set = new HashSet<>();
         for(int num : arr) {
            if(set.contains(num + x) || set.contains(num - x)){
                return true;
            }
            set.add(num);
         }
         return false;
    }
    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 50, 80};
        int x = 78;
        if(findPair(arr, x)) {
            System.out.println("yes");

        }else{
            System.out.println("no");
        }
    }   
      
}
