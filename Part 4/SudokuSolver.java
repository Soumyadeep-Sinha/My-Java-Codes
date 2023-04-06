public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3,8,0,9,0,0,2,0,5},
                {0,0,0,0,0,8,7,3,0},
                {0,6,0,3,0,0,9,8,0},
                {0,0,0,0,0,3,5,0,1},
                {9,1,0,5,0,7,0,2,3},
                {7,0,3,1,0,0,0,0,0},
                {0,3,5,0,0,1,0,9,0},
                {0,7,4,6,0,0,0,0,0},
                {8,0,1,0,0,2,0,6,7}
        };
        if(solveSudoku(board)){
            display(board);
        }else {
            System.out.println("Cannot be solved");
        }

    }

    public static boolean isSafe(int[][] board, int row, int col, int num){
        // checking row
        for (int i = 0; i < board.length; i++) {
            // checking if number is in the row
            if(board[row][col] == num){
                return false;
            }
        }

        // checking col
        for (int[] nums:board) {
            // checking if number is in the col
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt ; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean solveSudoku(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you found some empty element in row, then break
            if(!emptyLeft){
                break;
            }
        }
        if(emptyLeft){
            return true;
            //sudoku is solved
        }

        //backtrack

        for (int number = 1; number <= 9 ; number++) {
            if(isSafe(board,row,col,number)){
                board[row][col] = number;
                if(solveSudoku(board)){
                    return true;
                }else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    public static void display(int[][] board){
        for(int[] row : board){
            for (int num : row){
                System.out.print("["+ num + "]" + " ");
            }
            System.out.println("");
        }
    }
}
