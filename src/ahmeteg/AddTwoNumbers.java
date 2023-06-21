package ahmeteg;

import java.util.ArrayList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node=new ListNode(9);
        ListNode node1=new ListNode(9);
        ListNode node2=new ListNode(9);

        ListNode node3=new ListNode(9);
        ListNode node4=new ListNode(9);
        ListNode node5=new ListNode(9);
        ListNode node6=new ListNode(9);
        node.next=node1;
        node1.next=node2;
        node2.next=node6;

        node3.next=node4;
        node4.next=node5;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(Math.abs(arr.get(i-1)-arr.get(i))<9)
                Math.abs(arr.get(i-1)-arr.get(i));
        }

       ListNode sum= addTwoNumbersWithremainder(node,node3,0);
       while (sum!=null){
           System.out.print(" "+sum.val);
           sum=sum.next;
       }

    }

    public static ListNode addTwoNumbersWithremainder(ListNode l1, ListNode l2,int remainder ) {
        ListNode result =new ListNode();
        if(l1==null&&l2==null){
            if (remainder==1){
                ListNode temp=new ListNode();
                temp.val=1;
                return temp;
            }
            else
                return null;
        }

        if(l1==null){

            ListNode temp=new ListNode();
            temp.val=0;
            l1=temp;
        }
        if(l2==null){
            ListNode temp=new ListNode();
            temp.val=0;
            l2=temp;
        }




        result.val=l1.val+l2.val+remainder;
        if(result.val>=10){
            result.val=result.val-10;
            result.next=addTwoNumbersWithremainder(l1.next,l2.next,1);
        }
        else
            result.next=addTwoNumbersWithremainder(l1.next,l2.next,0);


        return result;
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2,int remainder) {
        ListNode result =new ListNode();

        if(l1==null&&l2==null){
            if (remainder==1){
                ListNode temp=new ListNode();
                temp.val=1;
                return temp;
            }
            else
                return null;
        }

        if(l1==null){

        ListNode temp=new ListNode();
        temp.val=0;
        l1=temp;
        }
        if(l2==null){
            ListNode temp=new ListNode();
            temp.val=0;
            l2=temp;
        }



        result.val=l1.val+l2.val+remainder;
        if(result.val>=10){
            result.val=result.val-10;
            result.next=addTwoNumbers(l1.next,l2.next,1);
        }
        else
            result.next=addTwoNumbers(l1.next,l2.next,0);

        return result;

    }
    public static ListNode reverseNode(ListNode l1){
        if(l1==null)
            return null;
        if(l1.next ==null)
            return l1;

        ListNode secondNode=l1.next;

        ListNode result=reverseNode(secondNode);
        secondNode.next=l1;
        l1.next=null;
        return result;
    }
}
