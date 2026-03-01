public class ceil {
    static int ceilSearch(int[] arr, int x){
        int lo = 0;
         int hi = arr.length-1;
         int res = -1;

         while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] < x)
                lo = mid + 1;
            else{
                res = mid;
                hi = mid - 1;
            }
         }
         return res;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 3;
        int index = ceilSearch(arr, x);
         if(index == -1){
            System.out.println("Ceiling of " + x + " does not exist in the array");
            
         }else {
            System.out.println("Ceiling of " + x + " is " + arr[index]);
         }
    }

}
