import java.util.List;

public class SortedListToBST {

     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

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


     public static TreeNode sortedListToBST(ListNode head) {
        return getBST(head, null);
     }

     public static TreeNode getBST(ListNode head, ListNode end){
         ListNode slow = head;
         ListNode fast = head;
         if(head == end){
             return null;
         }
         while (fast != end && fast.next != end){
             fast = fast.next.next;
             slow = slow.next;
         }

         TreeNode root = new TreeNode(slow.val);
         root.left = getBST(head, slow);
         root.right = getBST(slow.next, end);

         return root;
     }



    public static void main(String[] args) {

    }
}
