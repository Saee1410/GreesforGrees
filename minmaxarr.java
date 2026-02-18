import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class minmaxarr {
    public static void findMinMax(ArrayList<Integer> arr, ArrayList<Integer> result) {
        int n = arr.size();
        int min, max, i;

        if(n % 2 == 1) {
            min = max = arr.get(0);
            i = 1;
        } else {
            if(arr.get(0) < arr.get(1)){
                min = arr.get(0);
                max = arr.get(1);
            }else{
                min = arr.get(1);
                max = arr.get(0);
            }
            i = 2;
        }
 
        while (i < n-1) {
            if(arr.get(i) < arr.get(i + 1)){
                min = Math.min(min, arr.get(i));
                max = Math.max(max, arr.get(i + 1));
            }else {
                min = Math.min(min, arr.get(i + 1));
                max = Math.max(max, arr.get(i));
            }
            i += 2;
        }
        result.add(min);
        result.add(max);
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList( 3, 5, 4, 1, 9));
        ArrayList<Integer> result = new ArrayList<>();
        findMinMax(arr, result);
        System.out.println("Minimum: " + result.get(0) + " Maximum: " + result.get(1));
    }
}
