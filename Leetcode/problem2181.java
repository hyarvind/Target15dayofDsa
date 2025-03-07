class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Problem2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode current = head;
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        int sum = 0;
        
        while (current != null) {
            if (current.val == 0 && sum != 0) {
                result.next = new ListNode(sum);
                result = result.next;
                sum = 0;
            } else if (current.val != 0) {
                sum += current.val;
            }
            current = current.next;
        }
        
        return dummy.next;
    }

    public static void main(String[] args) {
        Problem2181 solution = new Problem2181();
        
        ListNode head = new ListNode(0);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next.next.next = new ListNode(0);
        
        ListNode result = solution.mergeNodes(head);
        
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}


