package Linkedlist;

public class simpleway {
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        Node n2 = new Node(1);
        Node n3 = new Node(2);
        Node n4 = new Node(3);
        Node n5 = new Node(4);
        
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        
        Node temp = head;
        int result = 0;
        while (temp != null) {
            result = result + temp.data;
            temp = temp.next;
        }
        
        System.out.println("Total number is = " + result);

        int even = 0, odd = 0;
        temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            temp = temp.next;
        }
        System.out.println("even number " + even);
        System.out.println("odd number " + odd);
        
        Node middle = findMiddle(head);
        System.out.println("Middle node is = " + middle.data);
    }

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        int size=0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

       
       Node temp =head;
        while (temp !=null) {
            size++;
            temp =temp.next;
        }
        return slow;
    }
}
