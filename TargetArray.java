import java.util.ArrayList;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        createTargetArray(nums, index);
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            ans.add(index[i], nums[i]);
        }
        int[] target = new int[len];
        for (int i = 0 ; i < len ; i++){
            target[i] = ans.get(i);
        }
        return target;
    }

//    public static boolean sameindex(int[] index){
//        for (int i = 0 ; i < index.length; i++){
//            for (int j = 1; j < index.length; j++) {
//                if(index[i] == index[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
