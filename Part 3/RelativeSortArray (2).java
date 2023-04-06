import java.util.*;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Queue<Integer> cst = new LinkedList<>();
        ArrayList<Integer> uncommon = new ArrayList<>();

        ArrayList<Integer> choices = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            choices.add(arr2[i]);
        }
        int[] ans = new int[arr1.length];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[j] == arr2[i]){
                    cst.offer(arr1[i]);
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if(!choices.contains(arr1[i])){
                uncommon.add(arr1[i]);
            }
        }

        System.out.println(cst.size());
        System.out.println(uncommon.size());

        for (int i = 0; i < cst.size(); i++) {
            ans[i] = cst.poll();
        }
//        for (int i = ans. i < ; i++) {
//
//        }


        return ans;
    }
}
