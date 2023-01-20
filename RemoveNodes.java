public class RemoveNodes {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {

        public static ListNode removeNodes(ListNode head) {
            if(head == null){
                return head;
            }
            head.next = removeNodes(head.next);
            if(head.next != null && head.val < head.next.val){
                return head.next;
            }
            return head;
        }
    }

    public static void main(String[] args) {

    }
}
