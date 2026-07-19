import java.util.ArrayList;
import java.util.List;

/**
 * Day_28_PalindromeLinkedList
 * 
 * problem No:234
 */

 class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val=val;
        }
    }

public class Day_28_PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode head =new ListNode(3);
        head.next=new ListNode(2);
        head.next=new ListNode(2);
        head.next=new ListNode(1);

        Day_28_PalindromeLinkedList s =new Day_28_PalindromeLinkedList();
        System.out.println(s.isPalindrome(head));
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
       List<Integer> list=new ArrayList<>(); 

       ListNode current=head;

       while (current!=null) {
            list.add(current.val);
            current=current.next;
       }

       int left=0;
       int right=list.size()-1;

       while(left<right) {
            if(list.get(left)!=list.get(right)){
                return false;
            }
            left++;
            right--;
       } 
       return true;
    }
}

