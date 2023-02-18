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
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr.next!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr = next;
        }
        curr.next=prev;
        prev = curr;

        ListNode next = curr.next;

        while (next!=null){
            if(next.val>=curr.val){
                curr.next = next;
                curr=next;
            }
            next = next.next;
        }
        curr.next = next;

        curr = prev;
        prev = null;
        while(curr.next!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr = next;
        }
        curr.next=prev;
        prev = curr;

        return prev;
    }
}