class  ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }
}

public class Day_33_FindCycle {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(2);

        Day_33_FindCycle obj=new Day_33_FindCycle();
        boolean result=obj.findCycle(head);
        System.out.println(result);
    }

    public boolean findCycle(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;

       while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
       }
       return false;
    }
}
