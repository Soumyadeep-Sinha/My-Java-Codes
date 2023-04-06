import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row = null;
        List<Integer> previous = null;

        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(previous.get(j-1) + previous.get(j));
                }

                previous = row;
                ans.add(row);
            }
        }
        return ans;
    }
}
