package solution;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode tail = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = tail;
            tail = head;
            head = next;
        }
        return tail;
    }
}
