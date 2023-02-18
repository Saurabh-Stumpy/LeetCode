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
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head.next;
        
        while(curr.next != null){
            curr.next=prev;
            prev = curr;
            curr = next;
            next=next.next;
        }
        curr.next = prev;
        prev = curr;
        
        int i = 1;
        int num = 0;
        while(prev!=null){
            num = num +(prev.val*i);
            i=i*2;
            prev = prev.next;
        }
        
        return num;
    }
}