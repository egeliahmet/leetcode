package ahmeteg;

public class IntersactionTwoNode {
    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(3);

        ListNode node3=new ListNode(4);
        ListNode node4=new ListNode(5);
        ListNode node5=new ListNode(6);
        ListNode node6=new ListNode(7);

        node.next=node1;
        node1.next=node2;
        node2.next=node3;

        node4.next=node5;
        node5.next=node3;


        node3.next=node6;
        System.out.println(getIntersectionNode(node,node4));

    }
    public static ListNode last(ListNode head){
        if(head==null)
            return null;
        if(head.next==null)
            return head;

        return last(head.next);

    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA=last(headA);
        ListNode tempB=last(headB);
        if(tempA!=tempB)
            return null;

        ListNode result=null;
        while(tempA==tempB&&tempA!=null){
            result=tempA;
            System.out.println(tempA.val);
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return result;

    }

}
