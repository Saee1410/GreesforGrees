public class rainWater {
    public int trap(int[] height){
        int n = height.length;
        int ans = 0;
        
        int low=1;
        int high = n-2;
        int lmax = 0;
        int rmax = 0;
        
        while(low <= high){
            lmax= Math.max(lmax, height[low]);
            rmax = Math.max(rmax, height[high]);
            if(rmax>lmax) {
                ans+= lmax-height[low++];

            }
            else {
                ans+= rmax-height[high--];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        rainWater sol = new rainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped water: " + sol.trap(height)); // Output: 6
    }
}
