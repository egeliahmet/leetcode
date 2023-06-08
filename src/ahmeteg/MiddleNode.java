package ahmeteg;

public class MiddleNode {
    public static void main(String[] args) {

    }
    public static ListNode middleNode(ListNode head) {
        int count=nodeCount(head);
        System.out.println(count/2);
        for(int j=0;j<count/2;j++){
            head=head.next;
        }
        return head;
    }
    static int i=0;
    public static int nodeCount(ListNode head){

        if(head==null)
            return 0;
        i++;
        nodeCount(head.next);
        return i;
    }
}
