import java.util.ArrayList;

public class Nearest_Exit {
    public static void main(String[] args) {
        char[][] maze = {
                {'+','+','.','+'},
                {'.','.','.','+'},
                {'+','.','+','+'},
                {'+','.','+','+'}
        };
        System.out.println(mazeobsArr("", maze,0,2));
    }
    public static ArrayList<String> mazeobsArr(String p, char[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(maze[r][c] == '+'){
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
