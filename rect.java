import java.util.Stack;

public class rect {
    static int getMaxArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int res = 0;

        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                int tp = s.pop();

                int width = s.isEmpty() ? i : i - s.peek() - 1;
                res = Math.max(res, heights[tp] * width);

            }
            s.push(i);
        }

        while (!s.isEmpty()){
            int tp = s.pop();
            int width = s.isEmpty() ? n : n - s.peek() - 1;
            res = Math.max(res, heights[tp] * width);
        }
        return res;
    }
    static int maxArea(int[][] mat) {
        int n = mat.length, m= mat[0].length;
        int[] heights = new int[m];
        int    ans = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j< m; j++){
                if(mat[i][j] == 0)
                    heights[j] = 0;
                else
                    heights[j] += mat[i][j];
            }
            ans = Math.max(ans, getMaxArea(heights));
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] mat = {{0,1,1,0},
                       {1,1,1,1},
                       {1,1,1,0},
                       {1,1,0,0}};
        System.out.println(maxArea(mat));
        
    }
}
