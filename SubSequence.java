import java.util.ArrayList;

public class SubSequence { // subsequence is for strings // subsets are for arrays
    public static void main(String[] args) {
        System.out.println(funList("", "abc"));
    }

    public static void fun(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        // take it or leave it
        fun(p + ch, up.substring(1)); // take it
        fun(p, up.substring(1)); // ignore it
    }

    //print it in an arraylist

    public static ArrayList<String> funList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // take it or leave it
        ArrayList<String> left = funList(p + ch, up.substring(1));
        ArrayList<String> right = funList(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
