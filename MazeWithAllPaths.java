import java.util.Arrays;

public class MazeWithAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[maze.length][maze[0].length];
//        MazeNores("", maze, 0, 0);
        MazeNoresPrint("", maze,0,0, path, 1);
    }

    public static void MazeNores(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        // considering the block in the path
        maze[r][c] = false;

        if(r < maze.length-1){
            MazeNores(p+'D', maze, r+1, c);
        }
        if(c < maze[0].length-1){
            MazeNores(p+'R', maze, r, c+1);
        }
        if(r > 0){
            MazeNores(p+'U', maze, r-1, c);
        }
        if(c > 0){
            MazeNores(p+'L', maze, r, c-1);
        }
        // function ends here
        // we have to revert the changes
        maze[r][c] = true;
    }

    public static void MazeNoresPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step; // last step is also a step
            for (int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        // considering the block in the path
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length-1){
            MazeNoresPrint(p+'D', maze, r+1, c, path, step+1);
        }
        if(c < maze[0].length-1){
            MazeNoresPrint(p+'R', maze, r, c+1, path, step+1);
        }
        if(r > 0){
            MazeNoresPrint(p+'U', maze, r-1, c, path, step+1);
        }
        if(c > 0){
            MazeNoresPrint(p+'L', maze, r, c-1, path, step+1);
        }
        // function ends here
        // we have to revert the changes
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
