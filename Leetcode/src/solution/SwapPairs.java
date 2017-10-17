package solution;

public class SwapPairs {
	/*
	Given a linked list, swap every two adjacent nodes and return its head.
	
	For example,
	Given 1->2->3->4, you should return the list as 2->1->4->3.
	
	Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
	 */
    public ListNode swapPairs(ListNode head) {
        ListNode ret = new ListNode(-1);
        ret.next = head;
        
        ListNode prevNode = ret;
        ListNode nextNode = head;
        
        while (nextNode != null && nextNode.next != null) {
        	prevNode.next = nextNode.next;
        	
        	ListNode tmp = nextNode.next.next;
        	nextNode.next.next = nextNode;
        	nextNode.next = tmp;
        	
        	prevNode = nextNode;
        	nextNode = tmp;
        }
        
        return ret.next;
    }
}