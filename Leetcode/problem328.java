class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class problem328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            
            odd = odd.next;
            even = even.next;
        }
        
        odd.next = evenHead;
        return head;
    }
    
    public static void main(String[] args) {
        problem328 solution = new problem328();
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ListNode result = solution.oddEvenList(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}


