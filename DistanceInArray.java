import java.util.ArrayList;
import java.util.List;

public class DistanceInArray {
    public static void main(String[] args) {
        List<Integer> dist = new ArrayList<>();
        dist.add(1);
        dist.add(2);
        dist.add(3);
        dist.add(4);
        dist.add(10);
        System.out.println(minimumDistances(dist));
    }
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < a.size(); i++) {
//            for (int j = i + 1; j < a.size(); j++) {
//                if(a.get(i) == a.get(j)&& j - i < min){
//                    min = j - i;
//                }
//            }
//        }
//        if(min == Integer.MAX_VALUE){
//            return -1;
//        }
//        return min;
        int temp = Integer.MAX_VALUE;
        int min_dist = -1;
        for (int i = 0; i < a.size(); i++) {
            if (a.lastIndexOf(a.get(i)) != a.indexOf(a.get(i))){
                int min = Math.abs(a.lastIndexOf(a.get(i)) - a.indexOf(a.get(i)));
                temp = Math.min(temp, min);
                min_dist = temp;
            }
        }
        return min_dist;
    }
}
