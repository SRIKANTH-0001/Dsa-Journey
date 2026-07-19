class  ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }
}

public class Day_34_SwapNodes {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);

        Day_34_SwapNodes obj=new Day_34_SwapNodes();
        ListNode result=obj.swapNodes(head);
         System.out.print("[");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(",");
                System.out.print(" ");
            }
            result = result.next;
        }
        System.out.print("]");
    }

    public ListNode swapNodes(ListNode head) {
        ListNode temp=new ListNode(0);
        temp.next=head;

        ListNode cur=temp;
        while (cur.next!=null &&  cur.next.next!=null) {
            ListNode first=cur.next;
            ListNode second=cur.next.next;
            first.next=second.next;
            cur.next=second;
            cur.next.next=first;
            cur=cur.next.next;

        }
        return temp.next;
    }
}
