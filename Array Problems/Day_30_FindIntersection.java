 class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val=val;
        }
    }

public class Day_30_FindIntersection {
    public static void main(String[] args) {

         ListNode common =new ListNode(8);
         common.next=new ListNode(4);
         common.next.next=new ListNode(5);


        ListNode headA =new ListNode(4);
        headA.next=new ListNode(1);
         headA.next.next=common;


        ListNode headB =new ListNode(5);
        headB.next=new ListNode(6);
        headB.next.next=new ListNode(1);
        headB.next.next.next=common;

        Day_30_FindIntersection s =new Day_30_FindIntersection();
        ListNode res=s.findIntersection(headA, headB);
        System.out.println(res.val);
    }

    public ListNode findIntersection(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }

        ListNode a_pointer=headA;
        ListNode b_pointer=headB;

        while (a_pointer!=b_pointer) {
            if(a_pointer==null){
                a_pointer=headB;
            }else{
                a_pointer=a_pointer.next;
            }

            if(b_pointer==null){
                b_pointer=headA;
            }else{
                b_pointer=b_pointer.next;
            }
        }
        return a_pointer;
    }
}
