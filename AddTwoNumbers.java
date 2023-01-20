public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution1 {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode();
            int carry = 0;
            while(l1 != null || l2 != null){
                int ans = 0;
                if(l1 != null){
                    ans += l1.val;
                    l1 = l1.next;
                }

                if(l2 != null){
                    ans += l2.val;
                    l2 = l2.next;
                }

                ans += carry;
                carry = ans / 10;
                result = new ListNode(ans % 10);
                result = result.next;
            }
            return result;
        }
    }
    public static void main(String[] args) {

    }
}
