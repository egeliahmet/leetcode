package ahmeteg;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(3);
        node.next=node1;
        node1.next=node2;


        ListNode l2=reverseNode(node);
        while (l2!=null){
            System.out.println(l2.val);
        l2=l2.next;}
    }

    public static ListNode reverseNode(ListNode l1){
        if(l1==null)
            return null;
        if(l1.next==null)
            return l1;

        ListNode temp=l1.next;
        l1.next=null;
        ListNode reverseset =reverseNode(temp);
        temp.next=l1;

      return reverseset;
    }
}
