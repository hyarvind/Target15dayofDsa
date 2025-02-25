package Leetcode;

public class Problemno21 {
//// to create a structure(Node) in linkedlist..
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        Problemno21 solution = new Problemno21();

        ListNode list1 = solution.new ListNode(1);
        list1.next = solution.new ListNode(2);
        list1.next.next = solution.new ListNode(4);

        ListNode list2 = solution.new ListNode(1);
        list2.next = solution.new ListNode(3);
        list2.next.next = solution.new ListNode(4);

        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        ListNode current = mergedList;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
