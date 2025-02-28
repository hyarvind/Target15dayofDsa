public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class problem1721 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head, slow = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        ListNode first = fast;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode second = slow;
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }

    public static void main(String[] args) {
        problem1721 p = new problem1721();
        ListNode head = new ListNode(5);
        head.next = new ListNode(14);
        head.next.next = new ListNode(16);
        head.next.next.next = new ListNode(22);
        System.out.println(p.swapNodes(head, 2));
    }
}
