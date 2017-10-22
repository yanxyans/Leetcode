package solution;

public class ReverseListTwo {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode ret = new ListNode(0);
        ret.next = head;
        
        ListNode pre = ret;
        int i = 1;
        while (i < m) {
            pre = pre.next;
            i++;
        }
        
        ListNode first = pre.next;
        ListNode last = first;
        ListNode post = last.next;
        while (i < n) {
            ListNode next = post.next;
            post.next = first;
            first = post;
            post = next;
            i++;
        }
        
        pre.next = first;
        last.next = post;
        
        return ret.next;
    }
}
