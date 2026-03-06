import java.util.Arrays;

public class KnightTour {
    static int N = 5; // Board chi size (n x n)

    // Check kara ki (x, y) board chya aat aahe ka ani ajun visit kela nahiye ka (-1)
    static boolean isSafe(int x, int y, int[][] board) {
        return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1);
    }

    // Board print karnyasathi function
    static void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        // 1. Survatila saglya cells madhe -1 bhara
        for (int i = 0; i < N; i++) {
            Arrays.fill(board[i], -1);
        }

        // 2. Ghodyachya 8 possible moves (L-shape)
        int[] moveX = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] moveY = {1, 2, 2, 1, -1, -2, -2, -1};

        // 3. Knight chi survat (0, 0) pasun, step number 0
        board[0][0] = 0;

        // 4. Recursive function call kara
        if (solveKTUtil(0, 0, 1, board, moveX, moveY)) {
            printSolution(board);
        } else {
            System.out.println("-1"); // Jar solution shakya nasel tar
        }
    }

    // Main logic: Recursion + Backtracking
    static boolean solveKTUtil(int currX, int currY, int moveCount, int[][] board, int[] moveX, int[] moveY) {
        // Base Case: Jar sagle cells (N*N) visit jhale astil tar success!
        if (moveCount == N * N) {
            return true;
        }

        // Saglya 8 moves ek-ek karun try kara
        for (int i = 0; i < 8; i++) {
            int nextX = currX + moveX[i];
            int nextY = currY + moveY[i];

            if (isSafe(nextX, nextY, board)) {
                board[nextX][nextY] = moveCount; // Move kara (Step number taka)

                // Pudhchi step shodhnyasathi recursion
                if (solveKTUtil(nextX, nextY, moveCount + 1, board, moveX, moveY)) {
                    return true;
                } else {
                    // BACKTRACKING: Jar ha rasta chukicha asel, tar parat -1 kara
                    board[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }
}