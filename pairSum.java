import java.util.Arrays;

public class pairSum {
    static boolean isPossible(int[] a, int[] b, int k){
        Arrays.sort(a);

        Arrays.sort(b);
        for(int i=0; i< b.length/2; i++){
            int temp = b[i];
            b[i] = b[b.length - 1- i];
            b[b.length - 1 - i] = temp;
        }
        for(int i = 0; i< a.length; i++){
            if(a[i] + b[i] < k){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] a = {2, 1, 3};
        int[] b = {7, 8, 9};
        int k = 10;
        boolean result = isPossible(a, b, k);
        if(isPossible(a, b, k)){
            System.out.println("Yes, it is possible ('true')");
        } else {
            System.out.println("No, it is not possible ('false')");
        }
    }
}
