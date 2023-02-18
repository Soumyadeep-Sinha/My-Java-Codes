import java.util.ArrayList;
import java.util.List;

public class MinDistInBSTNodes {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Inorder(root,list);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size()-1; i++) {
            min = Math.min(min, Math.abs(list.get(i) - list.get(i+1)));
        }
        return min;
    }

    public void Inorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        Inorder(root.left, list);
        list.add(root.val);
        Inorder(root.right, list);
    }
    public static void main(String[] args) {

    }
}
