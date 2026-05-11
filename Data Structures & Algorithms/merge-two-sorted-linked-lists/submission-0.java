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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummay = new ListNode(0);
        ListNode ans = dummay;
        ListNode head1 = list1; ListNode head2 = list2;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                dummay.next = head1; dummay = dummay.next;
                head1 = head1.next;
            }else{
                dummay.next = head2;  dummay = dummay.next;
                head2 = head2.next;
            }
        }
        while(head1 != null){
            dummay.next = head1; dummay = dummay.next;
              head1 = head1.next;
        }
        while(head2 != null){
            dummay.next = head2;  dummay = dummay.next;
                head2 = head2.next;
        }
        return ans.next;
    }
}