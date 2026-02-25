import java.util.ArrayList;
import java.util.List;

public class Diagonal {
    public static void printDiagnolOrder(int[][] mat){
        if(mat == null || mat.length == 0) return;

        int n = mat.length;
        int m = mat[0].length;
        List<Integer> result = new ArrayList<>();

        for(int d = 0; d < n+ m -1; d++){
            int row = d < n ? d : n-1;
            int col = d - row;

            while(row >= 0 && col < m){
                result.add(mat[row][col]);
                row--;
                col++;
            }

        }
        for(int val : result){
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {
        int[][] mat ={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20}
        };
        System.out.println("Diagonal Order:");
        printDiagnolOrder(mat);
    }
}
