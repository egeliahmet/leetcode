package ahmeteg;

public class DeleteDuplicatesLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        //ListNode n3=new ListNode(3);
      //  ListNode n4=new ListNode(3);
        head.next=n1;
        n1.next=n2;
        //n2.next=n3;
       // n3.next=n4;

        ListNode answer=deleteDuplicates(head);
        while (answer!=null){
            System.out.print(" "+answer.val);
        answer=answer.next;
        }

    }
    public static ListNode deleteDuplicates(ListNode head) {

        if(head==null)
            return head;

        if(head.next!=null&&(head.val==head.next.val))
            head=head.next;

        head.next=deleteDuplicates(head.next);
        if(head.next!=null&&(head.val==head.next.val))
            head=head.next;
        return  head;
    }
}
