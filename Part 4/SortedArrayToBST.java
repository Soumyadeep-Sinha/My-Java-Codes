/**public class SortedArrayToBST {
     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, SortedListToBST.TreeNode left, SortedListToBST.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return getBST(nums, 0, nums.length-1);
    }

    public static TreeNode getBST(int[] nums, int start, int end){
        if(nums.length == 0){
            return null;
        }
        int mid = start + end / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = getBST(nums, 0, mid);
        root.right = getBST(nums, mid+1, nums.length-1);

        return root;
    }
}*/
