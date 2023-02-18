import java.util.ArrayList;
import java.util.List;

public class ExcelSheetCells {
    public static void main(String[] args) {

    }

    public static List<String> cellsInRange(String s) {
        char r1 = s.charAt(1);
        char r2 = s.charAt(4);
        char c1 = s.charAt(0);
        char c2 = s.charAt(3);
        List<String> str = new ArrayList<>();
        for (int i = c1; i <= c2; i++) {
            for (int j = r1; j <= r2; j++) {
                str.add("" + i + j);
            }
        }
        return str;
    }
}
