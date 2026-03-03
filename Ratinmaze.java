import java.util.*;

public class Ratinmaze {
    static ArrayList<String> result = new ArrayList<>();

    static int[] dRow = {1, 0, 0, -1};
    static int[] dCol = {0, -1, 1, 0};
    static String directions = "DLRU";

    public static void solve(int r, int c, int[][] maze, int n, String path, boolean[][] visited){
        if(r == n -1 && c == n - 1) {
            result.add(path);
            return;
        }
        visited[r][c] = true;
        for(int i = 0; i< 4; i++){
            int nextRow = r + dRow[i];
            int nextCol = c + dCol[i];

            if(nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < n && maze[nextRow][nextCol] == 1 && !visited[nextRow][nextCol]){
                solve(nextRow, nextCol, maze, n, path + directions.charAt(i), visited);
            }
        }
        visited[r][c] = false;
    }
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        solve(0, 0, maze, n, "", visited);
        System.out.println(result);
    }
}
