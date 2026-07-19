class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }
}

public class Day_31_ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Day_31_ReverseLinkedList res = new Day_31_ReverseLinkedList();

        ListNode result = res.reverseLinkedList(head);
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

    public ListNode reverseLinkedList(ListNode head) {
        if (head == null) return head;

        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
