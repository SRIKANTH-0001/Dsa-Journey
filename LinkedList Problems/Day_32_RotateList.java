/**
 * InnerDay_32_RotateList
 */
class  ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }
}

public class Day_32_RotateList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        int k=2;

        Day_32_RotateList rList=new Day_32_RotateList();

        ListNode result=rList.rotateList(head,k);

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

    private ListNode rotateList(ListNode head,int k) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode pre=null,cur=head;
        int size=0;

        while (cur!=null) {
            pre=cur;
            cur=cur.next;
            size++;
        }

        cur=head;
        pre.next=cur;

        int rotate=k%size;
        int location=size-rotate;

        for (int i = 0; i < location; i++) {
            pre=cur;
            cur=cur.next;
        }
        pre.next=null;
        return cur;
    }   
}
