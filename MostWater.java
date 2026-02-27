// import java.util.*;

public class MostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int left = 0, right = n-1;

        while(left < right){
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, width * minHeight);

            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        } 
        return maxWater;
    }
    public static void main(String[] args) {
        MostWater ms = new MostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = ms.maxArea(height);
        System.out.println("Maximum water that can be contained: " + result);   
    }
}
