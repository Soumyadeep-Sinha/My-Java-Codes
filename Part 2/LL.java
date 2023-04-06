public class LL {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode temp = head;

            int size = 0;
            while(temp != null){
                size++;
                temp = temp.next;
            }

            if(n == size){
                return head.next;
            }

            int num = size - n;
            ListNode dummyhead = head;
            for(int i = 0 ; i < num - 1 ; i++){
                dummyhead = dummyhead.next;
            }

            dummyhead.next = dummyhead.next.next;

            return head;
        }
    }
}
