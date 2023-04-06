import java.util.*;
public class BigStringtoInt {
    public static void main(String[] args) {
        List<String> unsorted = new ArrayList<>();
        unsorted.add("1");
        unsorted.add("31415926535897932384626433832795");
        unsorted.add("150");
        unsorted.add("3");
        System.out.println(bigSorting(unsorted));
    }
    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here
        List<String> sorted = new ArrayList<>();
        long[] num = new long[unsorted.size()];
        for (int i = 0; i < unsorted.size(); i++) {
            num[i] = Long.parseLong(unsorted.get(i));
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            sorted.add(Long.toString(num[i]));
        }
        System.out.println(sorted);
        return sorted;
    }
}
