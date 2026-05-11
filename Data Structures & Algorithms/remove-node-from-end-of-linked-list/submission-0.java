/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = head; int count = 1;
        while(newHead != null){
            newHead = newHead.next; count++;
        }
        ListNode dummay = new ListNode(0);
        ListNode ans = dummay;
        dummay.next = head; ListNode curr = dummay;
        for(int i=1; i<count-n; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return  ans.next;
    }
}
