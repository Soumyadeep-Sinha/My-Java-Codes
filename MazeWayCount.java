import java.util.ArrayList;

public class MazeWayCount {
    public static void main(String[] args) {
        System.out.println(count(3,3));
//        path("",3,3);
//        System.out.println(pathList("",3,3));
        System.out.println(pathListWithDiagonals("",3,3));
    }
    public static int count(int r, int c){ // we can only go right and down.
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r,c-1);
        return left + right;
    }

    public static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p + 'D'+ "->", r-1, c);
        }
        if(c > 1){
            path(p + 'R' + "->", r,c-1);
        }
    }

    public static ArrayList<String> pathList(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(pathList(p + 'D', r-1, c));
        }
        if(c > 1){
            list.addAll(pathList(p + 'R', r,c-1));
        }
        return list;
    }

    public static ArrayList<String> pathListWithDiagonals(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1 && c > 1){
            list.addAll(pathListWithDiagonals(p + 'D', r-1, c-1));
        }
        if(r > 1){
            list.addAll(pathListWithDiagonals(p + 'V', r-1, c));
        }
        if(c > 1){
            list.addAll(pathListWithDiagonals(p + 'H' , r,c-1));
        }
        return list;
    }
}
