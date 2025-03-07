package Linkedlist;

public class basics {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    //// to create a addfirst method
    public  void addfirstlist(int data){
        Node nd =new Node(data);
        if (head == null) {
            head=tail =nd;
           return; 
        }
        nd.next =head;
        head =nd ;

    }
    /// to addlast in list
    public void addlastlist(int data){
        Node nd= new Node(data);
        if (head ==null) {
            head=tail=nd;
            return;
            
        }
        tail.next =nd;
        tail =nd;
    }

    //// to print 
   public static void toprint(int data){
    Node temp =head;
    int result =0;
    while (temp !=null) {
       result=result+temp.data;
       size++;
        temp =temp.next;
    }
   
   System.out.println("total number is  = "+result);
   System.out.println(size);
   }

       /// cheak odd even
    public static void evenss(int data){
        Node temp =head;
        int even = 0;
       int odd = 0;

           while (temp != null) {
    if (temp.data % 2 == 0) {
        even++;
    } else {
        odd++;
    }
    temp = temp.next;
   }

     System.out.println("Odd numbers: " + odd);
     System.out.println("Even numbers: " + even);
 }

 ///// merge interval
 public static Node mergNode(Node head){
    Node current =head;
    Node dummy =new Node(0);
    Node result =dummy;
    int sum =0;

    while (current !=null){
        if (current.val ==0 && sum != 0) {
            result.next=new Node(sum);
            result =result.next;
            sum =0;
        }else if (current.val != 0) {
            sum+=current.next;

            
        }
    }
    return dummy.next;

 }

  /// mid find
  public static void tomidfind(int data){
    Node slow =head;
    Node fast =head;
    while (head !=null && head.next !=null) {
        slow =head.next;
        fast=head.next.next;
        
    }
    System.out.println(slow);
}
   public static void main(String[] args) {
    basics b =new basics();
    b.addfirstlist(1);
    b.addfirstlist(2);
    b.addfirstlist(3);
    b.addlastlist(4);
    b.addlastlist(5);
     b.toprint(0);
    //  b.evenss(0);
     b.tomidfind(0);
     b.mergNode(head);
     b.toprint(0);
   }
    
}
