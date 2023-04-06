import java.util.ArrayList;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true,false},
                {true,false,true,true},
                {true,true,true,false},
                {false,true,true,true}
        };
        mazeobs("", maze, 0, 0);
        System.out.println(mazeobsArr("", maze,0,0));

    }

    public static void mazeobs(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            mazeobs(p+'D', maze, r+1, c);
        }
        if(c < maze[0].length-1){
            mazeobs(p+'R', maze, r, c+1);
        }
    }

    public static ArrayList<String> mazeobsArr(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(!maze[r][c]){
            return list;
        }
        if(r < maze.length-1){
            list.addAll(mazeobsArr(p+'D', maze, r+1, c));
        }
        if(c < maze[0].length-1){
            list.addAll(mazeobsArr(p+'R', maze, r, c+1));
        }
        return list;
    }
}
